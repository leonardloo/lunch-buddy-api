package com.lunchbuddy.api;

import java.util.Collection;
import java.util.Date;
import java.util.Set;

import com.lunchbuddy.models.LunchDate;
import com.lunchbuddy.models.Request;
import com.lunchbuddy.models.TimeInterval;

public class MatchingAlgorithm {
	
	private static final String DEFAULT_RESTAURANT_ID = "restaurantId";
	
	
	static class MatchResult
	{
		private double distanceScore;
		private double timeIntervalScore;
		private double score;
		private Request matchedRequest;
		private TimeInterval dateTimeInterval; 
		
		public MatchResult (double distanceScore, double timeIntervalScore, double score, Request request, TimeInterval interval)
		{
			this.distanceScore = distanceScore;
			this.timeIntervalScore  = timeIntervalScore;
			this.score  = score;
			this.matchedRequest = request;
			this.dateTimeInterval = interval;
			
		}
	}
	
	
	
	public static LunchDate findMatch(Request currentRequest, Collection <Request> requestPool)
	{
		double bestScore = 0;
		MatchResult bestMatchResult = null;
		
		for (Request candidate : requestPool)
		{
			MatchResult matchResult = evaluateTheMatch(currentRequest, candidate);
			double matchScore = matchResult.score;
			if(matchScore > bestScore)
			{
				bestScore = matchScore;
				bestMatchResult = matchResult;
			}
			
		}
		
		if(bestMatchResult == null ) 
		{
			return null;
		}
		else
		{
			
			return new LunchDate (currentRequest, bestMatchResult.matchedRequest,DEFAULT_RESTAURANT_ID, 
					bestMatchResult.dateTimeInterval );
			
		}
	}
	
	private static MatchResult evaluateTheMatch (Request request1, Request request2)
	{
		
		TimeInterval intersection = request1.getInterval().overlapInterval(
				request2.getInterval());
		TimeInterval dateInterval;
		
		if(intersection == null )
		{
			return new MatchResult (0,0,0, null, null);
		
		}
		else
		{
			double length = intersection.getLength();
			double optimalLength = 3600000;  /// One hour
			
			Date start = intersection.getStartTime();
			Date end = intersection.getEndTime();
			
			if(length > optimalLength )
			{
				long newEnd = (long) start.getTime() + (long) optimalLength;
				end = new Date(newEnd);
				dateInterval  = new TimeInterval (start,end);
				
			}
			else
			{
				dateInterval  = intersection;
			}
			
			if(length < optimalLength/2)
			{
				return null;
			}
			else
			{
				double intervalScore = intervalScore(length, optimalLength); 
				double distanceScore = distanceScore(request1.getLat(),request1.getLon(),
						request2.getLon(),request2.getLon());
				
				double score = intervalScore + distanceScore;
				
				return new MatchResult(score, intervalScore, distanceScore, request2, dateInterval);
			}
			
		}
		
		
	}
	
	private static double  intervalScore(double length, double optimalLength)
	{
		return Math.min(length/optimalLength, 1);
	}
	
	private static double distanceScore (double lat1, double len1, double lat2, double len2)
	{
		double dist = Math.sqrt((lat1-lat2)*(lat1-lat2) + (len1-len2)*(len1-len2));	
		return 1;
	}

}

package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by ceciliaxiang on 2017-02-17.
 */


public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest() {

        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet() {

        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("new tweet");

        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));

        boolean exceptionThrown = false;

        try {
            tweets.add(tweet);
        } catch (IllegalArgumentException e) {
            exceptionThrown = true;
        }

        assertTrue(exceptionThrown);
    }

    public void testGetTweet() {

        ArrayList<Tweet> sortedTweets;

        TweetList tweets = new TweetList();
        assertEquals(tweets.getTweets().size(), 0);

        Tweet tweet = null;

        tweets.add(tweet);
        sortedTweets = tweets.getTweets();
        assertEquals(sortedTweets.size(), 1);
        assertEquals(tweets.getTweet(0), sortedTweets.get(0));


        tweets.add(tweet);
        sortedTweets = tweets.getTweets();
        assertEquals(sortedTweets.size(), 2);
        assertEquals(sortedTweets.get(0).getDate().compareTo(sortedTweets.get(1).getDate()), -1);


        tweets.add(tweet);
        sortedTweets = tweets.getTweets();
        assertEquals(sortedTweets.size(), 3);
        assertEquals(sortedTweets.get(0).getDate().compareTo(sortedTweets.get(1).getDate()), -1);
        assertEquals(sortedTweets.get(1).getDate().compareTo(sortedTweets.get(2).getDate()), -1);
    }

    public void testHasTweet() {

        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("test tweet");
        assertFalse(tweets.hasTweet(tweet));
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));

        tweet = new NormalTweet("test tweet 2");
        assertFalse(tweets.hasTweet(tweet));
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetCount() {

        TweetList tweets = new TweetList();
        assertEquals(tweets.getCount(), 0);

        NormalTweet tweet = new NormalTweet("this tweet");
        tweets.add(tweet);
        assertEquals(tweets.getCount(), 1);

        tweet = new NormalTweet("test tweet 2");

        tweets.add(tweet);
        assertEquals(tweets.getCount(), 2);
    }


    public void testDeleteTweet() {

        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("last tweet");
        tweets.add(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }

    public void testSortedTweets() {
        TweetList tweets1 = new TweetList();
        ArrayList<NormalTweet> originalTweets = new ArrayList<NormalTweet>();
        NormalTweet firstTweet = new NormalTweet("First Tweet");
        NormalTweet secondTweet = new NormalTweet("Second Tweet");

        tweets1.add(firstTweet);
        tweets1.add(secondTweet);

        originalTweets = tweets1.getTweets();

        NormalTweet first = originalTweets.get(0);
        NormalTweet second = originalTweets.get(1);

        try {
            assertEquals(first.getMessage(), firstTweet.getMessage());
            assertEquals(second.getMessage(), secondTweet.getMessage());
        } catch (Exception e) {
            Log.i("Error", "Mess up with order");
        }

    }
}




}

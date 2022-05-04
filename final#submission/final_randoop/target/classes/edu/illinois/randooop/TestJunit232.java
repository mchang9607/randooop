package edu.illinois.randooop;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class TestJunit232 {
        /*
         *Testcase Number:232
        */        @Test
        public void TestJunit232() {
            org.joda.time.Period e92;
            org.joda.time.Period z37;
            org.joda.time.Period k24;
            org.joda.time.Instant q97;
            org.joda.time.Duration c73;
            org.joda.time.Duration g32;
            org.joda.time.LocalTime d57;
            org.joda.time.LocalTime c79;
            org.joda.time.MutablePeriod k39;
            int integer3;
            int a74;
            long long3;
            integer3 = 6;
            long3 = 10;
            c73 = new org.joda.time.Duration(long3);
            q97 = org.joda.time.Instant.ofEpochSecond(long3);
            d57 = new org.joda.time.LocalTime(long3);
            c79 = d57.withSecondOfMinute(integer3);
            integer3 = 6;
            long3 = 10;
            c73 = new org.joda.time.Duration(long3);
            long3 = 10;
            e92 = new org.joda.time.Period(long3, long3);
            z37 = e92.plusWeeks(integer3);
            k24 = z37.plusSeconds(integer3);
            long3 = 10;
            c73 = new org.joda.time.Duration(long3);
            q97 = org.joda.time.Instant.ofEpochSecond(long3);
            d57 = new org.joda.time.LocalTime(long3);
            a74 = d57.getMinuteOfHour();
            k39 = new org.joda.time.MutablePeriod(long3, long3);
            g32 = org.joda.time.Duration.standardHours(long3);
            e92.toString();
        }

	
	
}

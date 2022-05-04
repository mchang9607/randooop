/**
 *
 */
public class classNameTest {
        /*
         *Testcase Number:0
        */        @Test
        public void TestJunit0() {
            org.joda.time.MutableInterval y75;
            long long1;
            long long3;
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            assertTrue(y75.equals(y75));
        }

        /*
         *Testcase Number:1
        */        @Test
        public void TestJunit1() {
            org.joda.time.LocalDate a33;
            a33 = new org.joda.time.LocalDate();
            a33.equals(a33);
        }

        /*
         *Testcase Number:2
        */        @Test
        public void TestJunit2() {
            org.joda.time.MutableInterval y75;
            org.joda.time.Duration f4;
            long long1;
            long long3;
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            f4 = org.joda.time.Duration.standardDays(long3);
            assertTrue(y75.equals(y75));
        }

        /*
         *Testcase Number:3
        */        @Test
        public void TestJunit3() {
            org.joda.time.LocalDate a33;
            org.joda.time.DateTime q59;
            a33 = new org.joda.time.LocalDate();
            q59 = a33.toDateTimeAtCurrentTime();
            a33.hashCode();
        }

        /*
         *Testcase Number:4
        */        @Test
        public void TestJunit4() {
            org.joda.time.MutableInterval y41;
            long long3;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y41.toString();
        }

        /*
         *Testcase Number:5
        */        @Test
        public void TestJunit5() {
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.hashCode();
        }

        /*
         *Testcase Number:6
        */        @Test
        public void TestJunit6() {
            org.joda.time.MutableInterval y41;
            org.joda.time.LocalTime e6;
            long long3;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.toString();
        }

        /*
         *Testcase Number:7
        */        @Test
        public void TestJunit7() {
            org.joda.time.Instant z86;
            long long3;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            assertTrue(z86.equals(z86));
        }

        /*
         *Testcase Number:8
        */        @Test
        public void TestJunit8() {
            org.joda.time.PeriodType p15;
            p15 = org.joda.time.PeriodType.yearMonthDay();
            p15.hashCode();
        }

        /*
         *Testcase Number:9
        */        @Test
        public void TestJunit9() {
            org.joda.time.MutableDateTime r7;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.toString();
        }

        /*
         *Testcase Number:10
        */        @Test
        public void TestJunit10() {
            org.joda.time.PeriodType w78;
            w78 = org.joda.time.PeriodType.yearDay();
            w78.toString();
        }

        /*
         *Testcase Number:11
        */        @Test
        public void TestJunit11() {
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            long long3;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            y41.toString();
        }

        /*
         *Testcase Number:12
        */        @Test
        public void TestJunit12() {
            org.joda.time.MutableDateTime r7;
            int integer3;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            integer3 = 6;
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setSecondOfDay(integer3);
            r7.equals(r7);
        }

        /*
         *Testcase Number:13
        */        @Test
        public void TestJunit13() {
            org.joda.time.MutableInterval y41;
            org.joda.time.LocalTime e6;
            long long3;
            int c30;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            c30 = e6.getMillisOfDay();
            assertTrue(y41.equals(y41));
        }

        /*
         *Testcase Number:14
        */        @Test
        public void TestJunit14() {
            org.joda.time.PeriodType b85;
            b85 = org.joda.time.PeriodType.yearMonthDay();
            assertTrue(b85.equals(b85));
        }

        /*
         *Testcase Number:15
        */        @Test
        public void TestJunit15() {
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            long long1;
            long long3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            y41.equals(y41);
        }

        /*
         *Testcase Number:16
        */        @Test
        public void TestJunit16() {
            java.lang.String a43;
            org.joda.time.PeriodType p15;
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            a43.equals(a43);
        }

        /*
         *Testcase Number:17
        */        @Test
        public void TestJunit17() {
            org.joda.time.PeriodType y44;
            y44 = org.joda.time.PeriodType.yearWeekDay();
            assertTrue(y44.equals(y44));
        }

        /*
         *Testcase Number:18
        */        @Test
        public void TestJunit18() {
            org.joda.time.DateTime e69;
            long long2;
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            e69.equals(e69);
        }

        /*
         *Testcase Number:20
        */        @Test
        public void TestJunit20() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            z86.toString();
        }

        /*
         *Testcase Number:21
        */        @Test
        public void TestJunit21() {
            org.joda.time.PeriodType q63;
            q63 = org.joda.time.PeriodType.seconds();
            q63.equals(q63);
        }

        /*
         *Testcase Number:22
        */        @Test
        public void TestJunit22() {
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType c78;
            p15 = org.joda.time.PeriodType.yearMonthDay();
            c78 = org.joda.time.DateTimeUtils.getPeriodType(p15);
            p15.toString();
        }

        /*
         *Testcase Number:23
        */        @Test
        public void TestJunit23() {
            org.joda.time.MutableDateTime r7;
            long long3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.toString();
        }

        /*
         *Testcase Number:24
        */        @Test
        public void TestJunit24() {
            org.joda.time.PeriodType s52;
            s52 = org.joda.time.PeriodType.yearDay();
            s52.equals(s52);
        }

        /*
         *Testcase Number:25
        */        @Test
        public void TestJunit25() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.YearMonth i66;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            z86.toString();
        }

        /*
         *Testcase Number:26
        */        @Test
        public void TestJunit26() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.MutableInterval y75;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration f4;
            org.joda.time.Duration s32;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            f4 = org.joda.time.Duration.standardDays(long3);
            s32 = f4.multipliedBy(long3);
            assertTrue(z86.equals(z86));
        }

        /*
         *Testcase Number:27
        */        @Test
        public void TestJunit27() {
            org.joda.time.MutableDateTime r7;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.hashCode();
        }

        /*
         *Testcase Number:28
        */        @Test
        public void TestJunit28() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.YearMonth i66;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMonthOfYear(integer3);
            z86.hashCode();
        }

        /*
         *Testcase Number:29
        */        @Test
        public void TestJunit29() {
            org.joda.time.PeriodType v51;
            v51 = org.joda.time.PeriodType.years();
            v51.hashCode();
        }

        /*
         *Testcase Number:30
        */        @Test
        public void TestJunit30() {
            org.joda.time.PeriodType w78;
            org.joda.time.PeriodType a95;
            w78 = org.joda.time.PeriodType.yearDay();
            a95 = w78.withHoursRemoved();
            w78.hashCode();
        }

        /*
         *Testcase Number:31
        */        @Test
        public void TestJunit31() {
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            long long3;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            y41.toString();
        }

        /*
         *Testcase Number:32
        */        @Test
        public void TestJunit32() {
            org.joda.time.Period x51;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.YearMonth i66;
            org.joda.time.LocalTime e6;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int integer3;
            int c30;
            long long1;
            long long3;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer2 = 10;
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            c30 = e6.getMillisOfDay();
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            integer4 = 4;
            x51 = new org.joda.time.Period(integer1, integer3, integer2, integer4, integer5, c30, integer5, integer4);
            x51.hashCode();
        }

        /*
         *Testcase Number:33
        */        @Test
        public void TestJunit33() {
            org.joda.time.Period m38;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            m38.hashCode();
        }

        /*
         *Testcase Number:34
        */        @Test
        public void TestJunit34() {
            org.joda.time.LocalDate a33;
            org.joda.time.DateTime q59;
            org.joda.time.DateTime i12;
            a33 = new org.joda.time.LocalDate();
            q59 = a33.toDateTimeAtCurrentTime();
            i12 = q59.withEarlierOffsetAtOverlap();
            assertTrue(a33.equals(a33));
        }

        /*
         *Testcase Number:35
        */        @Test
        public void TestJunit35() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.YearMonth i66;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMillisOfDay(integer3);
            z86.equals(z86);
        }

        /*
         *Testcase Number:36
        */        @Test
        public void TestJunit36() {
            org.joda.time.Instant q53;
            long long1;
            long1 = 7;
            q53 = org.joda.time.Instant.ofEpochSecond(long1);
            assertTrue(q53.equals(q53));
        }

        /*
         *Testcase Number:37
        */        @Test
        public void TestJunit37() {
            org.joda.time.YearMonth j57;
            j57 = new org.joda.time.YearMonth();
            j57.equals(j57);
        }

        /*
         *Testcase Number:38
        */        @Test
        public void TestJunit38() {
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            long long3;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            assertTrue(y41.equals(y41));
        }

        /*
         *Testcase Number:39
        */        @Test
        public void TestJunit39() {
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            r7.equals(r7);
        }

        /*
         *Testcase Number:40
        */        @Test
        public void TestJunit40() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            z86.hashCode();
        }

        /*
         *Testcase Number:41
        */        @Test
        public void TestJunit41() {
            org.joda.time.MutableInterval k32;
            k32 = new org.joda.time.MutableInterval();
            assertTrue(k32.equals(k32));
        }

        /*
         *Testcase Number:42
        */        @Test
        public void TestJunit42() {
            org.joda.time.MutableDateTime r7;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long long3;
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            r7.hashCode();
        }

        /*
         *Testcase Number:43
        */        @Test
        public void TestJunit43() {
            org.joda.time.Period m38;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration d58;
            long long3;
            long long1;
            int integer3;
            long3 = 10;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            d58 = b98.multipliedBy(long3);
            m38.toString();
        }

        /*
         *Testcase Number:44
        */        @Test
        public void TestJunit44() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth a14;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            z86.toString();
        }

        /*
         *Testcase Number:45
        */        @Test
        public void TestJunit45() {
            org.joda.time.DateTime e69;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            long long2;
            long long3;
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            y41.setDurationBeforeEnd(long2);
            assertTrue(e69.equals(e69));
        }

        /*
         *Testcase Number:46
        */        @Test
        public void TestJunit46() {
            org.joda.time.MutableInterval y41;
            org.joda.time.LocalTime e6;
            org.joda.time.MutableDateTime r7;
            long long3;
            int c30;
            int integer2;
            int integer4;
            int integer5;
            int integer1;
            int integer3;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            c30 = e6.getMillisOfDay();
            integer2 = 10;
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            r7.setDate(c30, integer2, integer5);
            y41.hashCode();
        }

        /*
         *Testcase Number:47
        */        @Test
        public void TestJunit47() {
            org.joda.time.MutablePeriod a43;
            a43 = new org.joda.time.MutablePeriod();
            a43.hashCode();
        }

        /*
         *Testcase Number:48
        */        @Test
        public void TestJunit48() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            r7.setMillisOfDay(integer3);
            z86.toString();
        }

        /*
         *Testcase Number:49
        */        @Test
        public void TestJunit49() {
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType c78;
            org.joda.time.PeriodType l52;
            p15 = org.joda.time.PeriodType.yearMonthDay();
            c78 = org.joda.time.DateTimeUtils.getPeriodType(p15);
            l52 = org.joda.time.DateTimeUtils.getPeriodType(c78);
            assertTrue(p15.equals(p15));
        }

        /*
         *Testcase Number:50
        */        @Test
        public void TestJunit50() {
            org.joda.time.Duration l13;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            l13.toString();
        }

        /*
         *Testcase Number:51
        */        @Test
        public void TestJunit51() {
            org.joda.time.Seconds d8;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            d8.hashCode();
        }

        /*
         *Testcase Number:52
        */        @Test
        public void TestJunit52() {
            org.joda.time.Partial p78;
            p78 = new org.joda.time.Partial();
            assertTrue(p78.equals(p78));
        }

        /*
         *Testcase Number:53
        */        @Test
        public void TestJunit53() {
            org.joda.time.Period y94;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            long long3;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            y94.toString();
        }

        /*
         *Testcase Number:54
        */        @Test
        public void TestJunit54() {
            org.joda.time.Period y94;
            org.joda.time.Period m41;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            r7.setMillisOfDay(integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            m41 = y94.withMonths(integer3);
            assertTrue(y94.equals(y94));
        }

        /*
         *Testcase Number:55
        */        @Test
        public void TestJunit55() {
            org.joda.time.Seconds d8;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.MutableInterval y75;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration f4;
            org.joda.time.Duration s32;
            org.joda.time.YearMonth i66;
            org.joda.time.DateTime m33;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int integer3;
            long long1;
            long long3;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer4 = 4;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMillisOfDay(integer3);
            integer4 = 4;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            f4 = org.joda.time.Duration.standardDays(long3);
            s32 = f4.multipliedBy(long3);
            m33 = new org.joda.time.DateTime(integer5, integer4, integer5, integer4, integer3);
            d8.hashCode();
        }

        /*
         *Testcase Number:56
        */        @Test
        public void TestJunit56() {
            org.joda.time.PeriodType h89;
            h89 = org.joda.time.PeriodType.weeks();
            h89.hashCode();
        }

        /*
         *Testcase Number:57
        */        @Test
        public void TestJunit57() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.MutablePeriod l42;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            z86.hashCode();
        }

        /*
         *Testcase Number:58
        */        @Test
        public void TestJunit58() {
            org.joda.time.Duration l13;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType p15;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            assertTrue(l13.equals(l13));
        }

        /*
         *Testcase Number:59
        */        @Test
        public void TestJunit59() {
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setMinuteOfDay(integer2);
            r7.equals(r7);
        }

        /*
         *Testcase Number:60
        */        @Test
        public void TestJunit60() {
            org.joda.time.Period y94;
            org.joda.time.Period g38;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            int integer5;
            long long3;
            integer5 = 2;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            g38 = y94.withDays(integer5);
            y94.toString();
        }

        /*
         *Testcase Number:61
        */        @Test
        public void TestJunit61() {
            org.joda.time.MutableDateTime r7;
            long long3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMinuteOfDay(integer5);
            r7.hashCode();
        }

        /*
         *Testcase Number:62
        */        @Test
        public void TestJunit62() {
            org.joda.time.Duration l13;
            org.joda.time.MutableInterval y41;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType p15;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y41.setDurationAfterStart(long1);
            l13.toString();
        }

        /*
         *Testcase Number:63
        */        @Test
        public void TestJunit63() {
            org.joda.time.Period m38;
            org.joda.time.Period m70;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            m70 = m38.normalizedStandard();
            m38.hashCode();
        }

        /*
         *Testcase Number:64
        */        @Test
        public void TestJunit64() {
            org.joda.time.Period m38;
            org.joda.time.Period m70;
            org.joda.time.Period z50;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            r7.setMillisOfDay(integer3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            m70 = m38.normalizedStandard();
            z50 = m38.plusHours(integer5);
            m38.hashCode();
        }

        /*
         *Testcase Number:65
        */        @Test
        public void TestJunit65() {
            org.joda.time.DateTime e69;
            org.joda.time.YearMonth b53;
            long long2;
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            b53 = new org.joda.time.YearMonth(long2);
            e69.hashCode();
        }

        /*
         *Testcase Number:66
        */        @Test
        public void TestJunit66() {
            org.joda.time.Period m38;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Instant e28;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration d58;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            d58 = b98.multipliedBy(long3);
            e28 = z86.withMillis(long3);
            m38.equals(m38);
        }

        /*
         *Testcase Number:67
        */        @Test
        public void TestJunit67() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.MutablePeriod l42;
            java.lang.String a43;
            org.joda.time.IllegalInstantException c84;
            org.joda.time.PeriodType p15;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            assertTrue(z86.equals(z86));
        }

        /*
         *Testcase Number:68
        */        @Test
        public void TestJunit68() {
            org.joda.time.Period m38;
            org.joda.time.Period m70;
            org.joda.time.Period w95;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.YearMonth i66;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            m70 = m38.normalizedStandard();
            w95 = m38.minusHours(integer3);
            m38.hashCode();
        }

        /*
         *Testcase Number:69
        */        @Test
        public void TestJunit69() {
            org.joda.time.DateTime e69;
            org.joda.time.MonthDay d81;
            long long2;
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            d81 = new org.joda.time.MonthDay(long2);
            assertTrue(e69.equals(e69));
        }

        /*
         *Testcase Number:70
        */        @Test
        public void TestJunit70() {
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.DateTime e69;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            long long1;
            long long3;
            long long2;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            y41.setDurationBeforeEnd(long2);
            g78.add(long3);
            y41.toString();
        }

        /*
         *Testcase Number:71
        */        @Test
        public void TestJunit71() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.MutableInterval y75;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration f4;
            org.joda.time.Duration s32;
            org.joda.time.Duration t19;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            f4 = org.joda.time.Duration.standardDays(long3);
            s32 = f4.multipliedBy(long3);
            t19 = org.joda.time.Duration.standardMinutes(long3);
            z86.hashCode();
        }

        /*
         *Testcase Number:72
        */        @Test
        public void TestJunit72() {
            org.joda.time.Period m38;
            org.joda.time.Period i9;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration d58;
            org.joda.time.YearMonth i66;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMillisOfDay(integer3);
            long3 = 10;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            d58 = b98.multipliedBy(long3);
            i9 = m38.minusWeeks(integer5);
            m38.equals(m38);
        }

        /*
         *Testcase Number:73
        */        @Test
        public void TestJunit73() {
            org.joda.time.LocalDate a33;
            org.joda.time.DateTime q59;
            org.joda.time.DateTime i12;
            org.joda.time.DateTime w86;
            a33 = new org.joda.time.LocalDate();
            q59 = a33.toDateTimeAtCurrentTime();
            i12 = q59.withEarlierOffsetAtOverlap();
            w86 = a33.toDateTimeAtCurrentTime();
            assertTrue(a33.equals(a33));
        }

        /*
         *Testcase Number:74
        */        @Test
        public void TestJunit74() {
            org.joda.time.DateTime e69;
            org.joda.time.MonthDay d81;
            org.joda.time.MonthDay d67;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            long long2;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            d81 = new org.joda.time.MonthDay(long2);
            d67 = d81.withDayOfMonth(integer5);
            e69.toString();
        }

        /*
         *Testcase Number:75
        */        @Test
        public void TestJunit75() {
            org.joda.time.Period m38;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Instant e28;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration d58;
            org.joda.time.MutablePeriod c54;
            org.joda.time.PeriodType y44;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            d58 = b98.multipliedBy(long3);
            e28 = z86.withMillis(long3);
            long3 = 10;
            y44 = org.joda.time.PeriodType.yearWeekDay();
            c54 = new org.joda.time.MutablePeriod(long3, long3, y44);
            m38.equals(m38);
        }

        /*
         *Testcase Number:76
        */        @Test
        public void TestJunit76() {
            org.joda.time.DateTime e69;
            org.joda.time.DateTime k73;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            long long2;
            long long3;
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            y41.setDurationBeforeEnd(long2);
            k73 = e69.withEarlierOffsetAtOverlap();
            assertTrue(e69.equals(e69));
        }

        /*
         *Testcase Number:77
        */        @Test
        public void TestJunit77() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Instant l26;
            org.joda.time.MutableInterval y41;
            org.joda.time.MutableInterval y75;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration f4;
            org.joda.time.Duration s32;
            org.joda.time.Duration t19;
            org.joda.time.LocalTime e6;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth a14;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            f4 = org.joda.time.Duration.standardDays(long3);
            s32 = f4.multipliedBy(long3);
            t19 = org.joda.time.Duration.standardMinutes(long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            l26 = f20.plus(long3);
            z86.toString();
        }

        /*
         *Testcase Number:78
        */        @Test
        public void TestJunit78() {
            org.joda.time.MonthDay i39;
            i39 = new org.joda.time.MonthDay();
            i39.equals(i39);
        }

        /*
         *Testcase Number:79
        */        @Test
        public void TestJunit79() {
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            d8.equals(d8);
        }

        /*
         *Testcase Number:80
        */        @Test
        public void TestJunit80() {
            org.joda.time.Partial p78;
            int[] x81;
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            p78.equals(p78);
        }

        /*
         *Testcase Number:81
        */        @Test
        public void TestJunit81() {
            org.joda.time.Period y94;
            org.joda.time.Period g38;
            org.joda.time.Period u94;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            org.joda.time.MutableDateTime r7;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long long3;
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            integer5 = 2;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            g38 = y94.withDays(integer5);
            u94 = g38.withYears(integer2);
            y94.hashCode();
        }

        /*
         *Testcase Number:82
        */        @Test
        public void TestJunit82() {
            org.joda.time.Period m38;
            org.joda.time.Period m70;
            org.joda.time.Period b46;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration l13;
            org.joda.time.YearMonth i66;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType p15;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            r7.setMillisOfDay(integer3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setMinuteOfDay(integer2);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            m70 = m38.normalizedStandard();
            integer4 = 4;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            b46 = new org.joda.time.Period(integer3, integer2, integer4, integer5, integer3, integer4, integer3, integer3);
            m38.hashCode();
        }

        /*
         *Testcase Number:83
        */        @Test
        public void TestJunit83() {
            org.joda.time.DateTimeComparator h57;
            h57 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            h57.equals(h57);
        }

        /*
         *Testcase Number:84
        */        @Test
        public void TestJunit84() {
            org.joda.time.Period m38;
            org.joda.time.Period m70;
            org.joda.time.Period w95;
            org.joda.time.Period r4;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Instant e28;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration d58;
            org.joda.time.YearMonth i66;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            m70 = m38.normalizedStandard();
            w95 = m38.minusHours(integer3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            d58 = b98.multipliedBy(long3);
            e28 = z86.withMillis(long3);
            r4 = m38.withDays(integer3);
            assertTrue(m38.equals(m38));
        }

        /*
         *Testcase Number:85
        */        @Test
        public void TestJunit85() {
            org.joda.time.Period m38;
            org.joda.time.Period y94;
            org.joda.time.Period g38;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration d58;
            org.joda.time.Duration l13;
            org.joda.time.MutablePeriod g78;
            org.joda.time.MutablePeriod x88;
            org.joda.time.PeriodType w78;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            long3 = 10;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            d58 = b98.multipliedBy(long3);
            integer5 = 2;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            g38 = y94.withDays(integer5);
            long3 = 10;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            d58 = b98.multipliedBy(long3);
            integer2 = 10;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            integer2 = 10;
            integer3 = 6;
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setSecondOfDay(integer3);
            x88 = new org.joda.time.MutablePeriod(integer3, integer3, integer5, integer3, integer2, integer1, integer2, integer5);
            m38.equals(m38);
        }

        /*
         *Testcase Number:86
        */        @Test
        public void TestJunit86() {
            org.joda.time.Years g96;
            org.joda.time.Duration l13;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType p15;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            g96.toString();
        }

        /*
         *Testcase Number:87
        */        @Test
        public void TestJunit87() {
            org.joda.time.Period m38;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Instant e28;
            org.joda.time.Duration l13;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration d58;
            org.joda.time.MutableInterval y41;
            org.joda.time.LocalTime e6;
            org.joda.time.MutablePeriod l42;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int integer3;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            r7.setMillisOfDay(integer3);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            d58 = b98.multipliedBy(long3);
            e28 = z86.withMillis(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            l42.add(integer5, integer5, integer2, integer5, integer3, integer2, integer3, integer4);
            m38.toString();
        }

        /*
         *Testcase Number:88
        */        @Test
        public void TestJunit88() {
            org.joda.time.Years g96;
            org.joda.time.Duration l13;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType i68;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            i68 = g96.getPeriodType();
            g96.hashCode();
        }

        /*
         *Testcase Number:89
        */        @Test
        public void TestJunit89() {
            org.joda.time.PeriodType d44;
            d44 = org.joda.time.PeriodType.dayTime();
            assertTrue(d44.equals(d44));
        }

        /*
         *Testcase Number:90
        */        @Test
        public void TestJunit90() {
            org.joda.time.LocalTime e6;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration l13;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth a14;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType p15;
            org.joda.time.MutableDateTime r7;
            org.joda.time.MutableDateTime t55;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int c30;
            int integer3;
            long long3;
            long long1;
            org.joda.time.Seconds d8;
            org.joda.time.Years g96;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            java.lang.String a43;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            c30 = e6.getMillisOfDay();
            integer2 = 10;
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            r7.setDate(c30, integer2, integer5);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            integer1 = 8;
            t55 = new org.joda.time.MutableDateTime(integer4, integer5, integer3, integer5, integer3, integer2, integer1);
            e6.hashCode();
        }

        /*
         *Testcase Number:91
        */        @Test
        public void TestJunit91() {
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.DateTime e69;
            org.joda.time.MutablePeriod g78;
            org.joda.time.MutablePeriod z22;
            org.joda.time.PeriodType w78;
            long long1;
            long long3;
            long long2;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            y41.setDurationBeforeEnd(long2);
            g78.add(long3);
            z22 = g78.copy();
            y41.toString();
        }

        /*
         *Testcase Number:92
        */        @Test
        public void TestJunit92() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.YearMonth i66;
            org.joda.time.LocalTime e6;
            org.joda.time.MutablePeriod l42;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMillisOfDay(integer3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            y41.setDurationAfterStart(long3);
            z86.toString();
        }

        /*
         *Testcase Number:93
        */        @Test
        public void TestJunit93() {
            org.joda.time.LocalDate s4;
            org.joda.time.Period y94;
            org.joda.time.Period g38;
            org.joda.time.Period u94;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.DateTime e69;
            org.joda.time.MonthDay d81;
            org.joda.time.MonthDay d67;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            org.joda.time.MutableDateTime r7;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long long3;
            long long1;
            long long2;
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            integer5 = 2;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            g38 = y94.withDays(integer5);
            u94 = g38.withYears(integer2);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            d81 = new org.joda.time.MonthDay(long2);
            d67 = d81.withDayOfMonth(integer5);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            r7.setMillisOfDay(integer3);
            s4 = new org.joda.time.LocalDate(integer4, integer5, integer5);
            assertTrue(s4.equals(s4));
        }

        /*
         *Testcase Number:94
        */        @Test
        public void TestJunit94() {
            org.joda.time.Partial p78;
            org.joda.time.format.DateTimeFormatter w58;
            int[] x81;
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            w58 = p78.getFormatter();
            assertTrue(p78.equals(p78));
        }

        /*
         *Testcase Number:95
        */        @Test
        public void TestJunit95() {
            org.joda.time.PeriodType w13;
            w13 = org.joda.time.PeriodType.weeks();
            w13.equals(w13);
        }

        /*
         *Testcase Number:96
        */        @Test
        public void TestJunit96() {
            org.joda.time.Period m38;
            org.joda.time.Period x75;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration d58;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int integer3;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setMinuteOfDay(integer2);
            long3 = 10;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            d58 = b98.multipliedBy(long3);
            x75 = m38.plusSeconds(integer4);
            m38.hashCode();
        }

        /*
         *Testcase Number:97
        */        @Test
        public void TestJunit97() {
            org.joda.time.Period y37;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.YearMonth i66;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMillisOfDay(integer3);
            y37 = org.joda.time.Period.hours(integer3);
            y37.equals(y37);
        }

        /*
         *Testcase Number:98
        */        @Test
        public void TestJunit98() {
            org.joda.time.MutableInterval y75;
            org.joda.time.Duration f4;
            long long1;
            long long3;
            long l25;
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            f4 = org.joda.time.Duration.standardDays(long3);
            l25 = f4.getStandardSeconds();
            assertTrue(y75.equals(y75));
        }

        /*
         *Testcase Number:99
        */        @Test
        public void TestJunit99() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth a14;
            org.joda.time.DateTimeFieldType[] g81;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            g81 = a14.getFieldTypes();
            z86.equals(z86);
        }

        /*
         *Testcase Number:100
        */        @Test
        public void TestJunit100() {
            boolean r60;
            org.joda.time.Years g96;
            org.joda.time.Duration l13;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType i68;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            i68 = g96.getPeriodType();
            r60 = g96.isGreaterThan(g96);
            g96.toString();
        }

        /*
         *Testcase Number:101
        */        @Test
        public void TestJunit101() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Instant a3;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth a14;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            a3 = f20.withDurationAdded(long3, integer4);
            z86.toString();
        }

        /*
         *Testcase Number:102
        */        @Test
        public void TestJunit102() {
            org.joda.time.PeriodType i80;
            i80 = org.joda.time.PeriodType.standard();
            i80.hashCode();
        }

        /*
         *Testcase Number:103
        */        @Test
        public void TestJunit103() {
            org.joda.time.Period v14;
            v14 = new org.joda.time.Period();
            v14.equals(v14);
        }

        /*
         *Testcase Number:104
        */        @Test
        public void TestJunit104() {
            org.joda.time.MutableDateTime r7;
            long long3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            org.joda.time.DateTimeUtils.setCurrentMillisOffset(long3);
            r7.equals(r7);
        }

        /*
         *Testcase Number:105
        */        @Test
        public void TestJunit105() {
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration l13;
            org.joda.time.LocalTime e6;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth a14;
            org.joda.time.DateTimeFieldType[] g81;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType p15;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            org.joda.time.LocalDate u92;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            java.lang.String a43;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            g81 = a14.getFieldTypes();
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y41.setDurationAfterStart(long1);
            u92 = new org.joda.time.LocalDate(integer3, integer5, integer5);
            assertTrue(y79.equals(y79));
        }

        /*
         *Testcase Number:106
        */        @Test
        public void TestJunit106() {
            org.joda.time.Period y94;
            org.joda.time.Period g38;
            org.joda.time.Period u94;
            org.joda.time.Period o15;
            org.joda.time.Years g96;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration l13;
            org.joda.time.MutablePeriod g78;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType w78;
            org.joda.time.PeriodType p15;
            org.joda.time.MutableDateTime r7;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long long3;
            long long1;
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            integer5 = 2;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            g38 = y94.withDays(integer5);
            u94 = g38.withYears(integer2);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            o15 = new org.joda.time.Period(long3, p15);
            y94.toString();
        }

        /*
         *Testcase Number:107
        */        @Test
        public void TestJunit107() {
            org.joda.time.Period y37;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.MutableInterval y75;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration f4;
            org.joda.time.Duration s32;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth e22;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            f4 = org.joda.time.Duration.standardDays(long3);
            s32 = f4.multipliedBy(long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMillisOfDay(integer3);
            y37 = org.joda.time.Period.hours(integer3);
            e22 = i66.withMonthOfYear(integer3);
            y37.equals(y37);
        }

        /*
         *Testcase Number:108
        */        @Test
        public void TestJunit108() {
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.Weeks r40;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            assertTrue(d8.equals(d8));
        }

        /*
         *Testcase Number:109
        */        @Test
        public void TestJunit109() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth a14;
            long long1;
            long long3;
            int integer3;
            int g59;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            g59 = e6.getSecondOfMinute();
            z86.toString();
        }

        /*
         *Testcase Number:110
        */        @Test
        public void TestJunit110() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth a14;
            long long1;
            long long3;
            int integer3;
            int g59;
            int e27;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            g59 = e6.getSecondOfMinute();
            e27 = e6.getSecondOfMinute();
            assertTrue(z86.equals(z86));
        }

        /*
         *Testcase Number:111
        */        @Test
        public void TestJunit111() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.MonthDay i63;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            r7.setMillisOfDay(integer3);
            i63 = new org.joda.time.MonthDay(long3);
            z86.toString();
        }

        /*
         *Testcase Number:112
        */        @Test
        public void TestJunit112() {
            org.joda.time.Period m38;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Instant e28;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration d58;
            org.joda.time.LocalTime e6;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth a14;
            org.joda.time.MutablePeriod c54;
            org.joda.time.PeriodType y44;
            long long1;
            long long3;
            int integer3;
            int g59;
            int e27;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            g59 = e6.getSecondOfMinute();
            e27 = e6.getSecondOfMinute();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            d58 = b98.multipliedBy(long3);
            e28 = z86.withMillis(long3);
            long3 = 10;
            y44 = org.joda.time.PeriodType.yearWeekDay();
            c54 = new org.joda.time.MutablePeriod(long3, long3, y44);
            c54.add(long3);
            m38.toString();
        }

        /*
         *Testcase Number:113
        */        @Test
        public void TestJunit113() {
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.Weeks r40;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int j57;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            d8.hashCode();
        }

        /*
         *Testcase Number:114
        */        @Test
        public void TestJunit114() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            java.lang.Object d96;
            org.joda.time.MutablePeriod l42;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            d96 = l42.clone();
            assertTrue(z86.equals(z86));
        }

        /*
         *Testcase Number:115
        */        @Test
        public void TestJunit115() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.MutablePeriod l42;
            java.lang.String a43;
            org.joda.time.IllegalInstantException c84;
            org.joda.time.IllegalInstantException f91;
            org.joda.time.PeriodType p15;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            f91 = new org.joda.time.IllegalInstantException(a43);
            z86.hashCode();
        }

        /*
         *Testcase Number:116
        */        @Test
        public void TestJunit116() {
            org.joda.time.Period y94;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth a14;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            long long1;
            long long3;
            int integer3;
            int g59;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            g59 = e6.getSecondOfMinute();
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            g78.setYears(integer3);
            assertTrue(y94.equals(y94));
        }

        /*
         *Testcase Number:117
        */        @Test
        public void TestJunit117() {
            org.joda.time.Duration l13;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType o55;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            o55 = p15.withDaysRemoved();
            l13.toString();
        }

        /*
         *Testcase Number:118
        */        @Test
        public void TestJunit118() {
            org.joda.time.PeriodType w78;
            org.joda.time.PeriodType a95;
            org.joda.time.PeriodType v52;
            w78 = org.joda.time.PeriodType.yearDay();
            a95 = w78.withHoursRemoved();
            v52 = w78.withMinutesRemoved();
            w78.equals(w78);
        }

        /*
         *Testcase Number:119
        */        @Test
        public void TestJunit119() {
            org.joda.time.Period y94;
            org.joda.time.Period r5;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.MutableInterval y75;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration f4;
            org.joda.time.Duration s32;
            org.joda.time.Duration t19;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            f4 = org.joda.time.Duration.standardDays(long3);
            s32 = f4.multipliedBy(long3);
            t19 = org.joda.time.Duration.standardMinutes(long3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            r5 = y94.withMinutes(integer3);
            y94.hashCode();
        }

        /*
         *Testcase Number:120
        */        @Test
        public void TestJunit120() {
            org.joda.time.Period y37;
            org.joda.time.Period m38;
            org.joda.time.Period m70;
            org.joda.time.Period w95;
            org.joda.time.Period t63;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.YearMonth i66;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMillisOfDay(integer3);
            y37 = org.joda.time.Period.hours(integer3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            m70 = m38.normalizedStandard();
            w95 = m38.minusHours(integer3);
            t63 = m70.minusDays(integer3);
            y37.equals(y37);
        }

        /*
         *Testcase Number:121
        */        @Test
        public void TestJunit121() {
            org.joda.time.Period m38;
            org.joda.time.Period m70;
            org.joda.time.Seconds d8;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.LocalTime e6;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalDateTime g84;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int c30;
            int integer3;
            int integer2;
            int integer4;
            int integer5;
            int integer1;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            c30 = e6.getMillisOfDay();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            m70 = m38.normalizedStandard();
            integer2 = 10;
            integer4 = 4;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g84 = new org.joda.time.LocalDateTime(c30, integer3, integer2, integer4, integer3, integer5);
            m38.toString();
        }

        /*
         *Testcase Number:122
        */        @Test
        public void TestJunit122() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration m68;
            org.joda.time.LocalTime e6;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth a14;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            m68 = org.joda.time.Duration.millis(long1);
            assertTrue(z86.equals(z86));
        }

        /*
         *Testcase Number:123
        */        @Test
        public void TestJunit123() {
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.LocalTime h89;
            org.joda.time.MutablePeriod l42;
            org.joda.time.IllegalInstantException c84;
            org.joda.time.PeriodType p15;
            org.joda.time.MutableDateTime r7;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            int integer3;
            long long1;
            long long3;
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            java.lang.String a43;
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            h89 = new org.joda.time.LocalTime(integer4, integer3, integer5);
            y79.toString();
        }

        /*
         *Testcase Number:124
        */        @Test
        public void TestJunit124() {
            org.joda.time.Period y94;
            org.joda.time.Period g38;
            org.joda.time.Period s57;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.MutablePeriod l42;
            org.joda.time.MutablePeriod g78;
            java.lang.String a43;
            org.joda.time.IllegalInstantException c84;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType w78;
            long long1;
            long long3;
            int integer3;
            int integer5;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            integer5 = 2;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            g38 = y94.withDays(integer5);
            s57 = g38.withDays(integer3);
            y94.equals(y94);
        }

        /*
         *Testcase Number:125
        */        @Test
        public void TestJunit125() {
            org.joda.time.Period j2;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            j2 = org.joda.time.Period.months(integer4);
            j2.toString();
        }

        /*
         *Testcase Number:126
        */        @Test
        public void TestJunit126() {
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.Seconds z17;
            org.joda.time.Weeks r40;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int j57;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            z17 = r40.toStandardSeconds();
            assertTrue(d8.equals(d8));
        }

        /*
         *Testcase Number:127
        */        @Test
        public void TestJunit127() {
            org.joda.time.Period y94;
            org.joda.time.Period r5;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.MutableInterval y75;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration f4;
            org.joda.time.Duration s32;
            org.joda.time.Duration t19;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            long long1;
            long long3;
            int integer3;
            int s21;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            f4 = org.joda.time.Duration.standardDays(long3);
            s32 = f4.multipliedBy(long3);
            t19 = org.joda.time.Duration.standardMinutes(long3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            r5 = y94.withMinutes(integer3);
            s21 = r5.getMillis();
            assertTrue(y94.equals(y94));
        }

        /*
         *Testcase Number:128
        */        @Test
        public void TestJunit128() {
            org.joda.time.DateTimeComparator p47;
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            p47.hashCode();
        }

        /*
         *Testcase Number:129
        */        @Test
        public void TestJunit129() {
            org.joda.time.PeriodType h34;
            h34 = org.joda.time.PeriodType.millis();
            assertTrue(h34.equals(h34));
        }

        /*
         *Testcase Number:130
        */        @Test
        public void TestJunit130() {
            org.joda.time.Period s37;
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.Weeks r40;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int j57;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            s37 = org.joda.time.Period.days(integer2);
            s37.hashCode();
        }

        /*
         *Testcase Number:131
        */        @Test
        public void TestJunit131() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth a14;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            r7.setSecondOfDay(integer3);
            z86.hashCode();
        }

        /*
         *Testcase Number:132
        */        @Test
        public void TestJunit132() {
            org.joda.time.Weeks r40;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth a14;
            org.joda.time.DateTime y1;
            org.joda.time.MutablePeriod l42;
            org.joda.time.IllegalInstantException c84;
            org.joda.time.PeriodType p15;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int g59;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int j57;
            int c30;
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            java.lang.String a43;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            g59 = e6.getSecondOfMinute();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            c30 = e6.getMillisOfDay();
            integer2 = 10;
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            r7.setDate(c30, integer2, integer5);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            y1 = new org.joda.time.DateTime(g59, integer3, integer4, integer5, integer5, integer3);
            r40.hashCode();
        }

        /*
         *Testcase Number:133
        */        @Test
        public void TestJunit133() {
            org.joda.time.PeriodType b76;
            b76 = org.joda.time.PeriodType.months();
            b76.toString();
        }

        /*
         *Testcase Number:134
        */        @Test
        public void TestJunit134() {
            org.joda.time.Years g96;
            org.joda.time.Duration l13;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType p15;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            long l24;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            l24 = l13.getStandardSeconds();
            assertTrue(g96.equals(g96));
        }

        /*
         *Testcase Number:135
        */        @Test
        public void TestJunit135() {
            org.joda.time.Period m38;
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration d58;
            org.joda.time.LocalTime e6;
            org.joda.time.LocalTime v59;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth a14;
            org.joda.time.MonthDay i63;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int integer3;
            int g59;
            long long1;
            long long3;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            r7.setMillisOfDay(integer3);
            i63 = new org.joda.time.MonthDay(long3);
            long3 = 10;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            d58 = b98.multipliedBy(long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            g59 = e6.getSecondOfMinute();
            v59 = new org.joda.time.LocalTime(integer4, integer4, integer3, g59);
            assertTrue(m38.equals(m38));
        }

        /*
         *Testcase Number:136
        */        @Test
        public void TestJunit136() {
            org.joda.time.PeriodType v71;
            v71 = org.joda.time.PeriodType.time();
            v71.equals(v71);
        }

        /*
         *Testcase Number:137
        */        @Test
        public void TestJunit137() {
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.Seconds u26;
            org.joda.time.Weeks r40;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int j57;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            u26 = d8.plus(d8);
            assertTrue(d8.equals(d8));
        }

        /*
         *Testcase Number:138
        */        @Test
        public void TestJunit138() {
            org.joda.time.Period c81;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Duration l13;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration f4;
            org.joda.time.Duration s32;
            org.joda.time.Duration t19;
            org.joda.time.MutableInterval y41;
            org.joda.time.MutableInterval y75;
            org.joda.time.DateTime e69;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType w78;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            long long2;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int integer3;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            f4 = org.joda.time.Duration.standardDays(long3);
            s32 = f4.multipliedBy(long3);
            t19 = org.joda.time.Duration.standardMinutes(long3);
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            y41.setDurationBeforeEnd(long2);
            c81 = new org.joda.time.Period(long1, long1, w78);
            c81.hashCode();
        }

        /*
         *Testcase Number:139
        */        @Test
        public void TestJunit139() {
            org.joda.time.Period y94;
            org.joda.time.Period r5;
            org.joda.time.Period m38;
            org.joda.time.Period s37;
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.Weeks r40;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.MutableInterval y75;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration f4;
            org.joda.time.Duration s32;
            org.joda.time.Duration t19;
            org.joda.time.Duration d58;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int j57;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            f4 = org.joda.time.Duration.standardDays(long3);
            s32 = f4.multipliedBy(long3);
            t19 = org.joda.time.Duration.standardMinutes(long3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            r5 = y94.withMinutes(integer3);
            long3 = 10;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            d58 = b98.multipliedBy(long3);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            s37 = org.joda.time.Period.days(integer2);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            r7.setMillisOfDay(integer3);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMinuteOfDay(integer5);
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            r7.setMillisOfDay(integer3);
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            r7.setDateTime(integer3, integer3, integer5, integer2, integer5, integer4, integer4);
            y94.hashCode();
        }

        /*
         *Testcase Number:140
        */        @Test
        public void TestJunit140() {
            org.joda.time.Period m38;
            org.joda.time.Period m70;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            long long1;
            long long3;
            int integer3;
            int s7;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            m70 = m38.normalizedStandard();
            s7 = m70.getMonths();
            m38.equals(m38);
        }

        /*
         *Testcase Number:141
        */        @Test
        public void TestJunit141() {
            org.joda.time.MutableInterval y41;
            org.joda.time.LocalTime e6;
            org.joda.time.MutablePeriod x23;
            long long3;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            x23 = new org.joda.time.MutablePeriod(long3);
            y41.hashCode();
        }

        /*
         *Testcase Number:142
        */        @Test
        public void TestJunit142() {
            org.joda.time.Period y94;
            org.joda.time.Period g38;
            org.joda.time.Period u94;
            org.joda.time.Period s37;
            org.joda.time.Period r5;
            org.joda.time.Weeks r40;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration f4;
            org.joda.time.Duration s32;
            org.joda.time.Duration t19;
            org.joda.time.LocalTime e6;
            org.joda.time.MutablePeriod g78;
            org.joda.time.MutablePeriod l42;
            org.joda.time.PeriodType w78;
            org.joda.time.MutableDateTime r7;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int j57;
            int s21;
            long long3;
            long long1;
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.MutableInterval y75;
            java.lang.Object d96;
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            integer5 = 2;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            g38 = y94.withDays(integer5);
            u94 = g38.withYears(integer2);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            s37 = org.joda.time.Period.days(integer2);
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            f4 = org.joda.time.Duration.standardDays(long3);
            s32 = f4.multipliedBy(long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            f4 = org.joda.time.Duration.standardDays(long3);
            s32 = f4.multipliedBy(long3);
            t19 = org.joda.time.Duration.standardMinutes(long3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            r5 = y94.withMinutes(integer3);
            integer5 = 2;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            g38 = y94.withDays(integer5);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            f4 = org.joda.time.Duration.standardDays(long3);
            s32 = f4.multipliedBy(long3);
            t19 = org.joda.time.Duration.standardMinutes(long3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            r5 = y94.withMinutes(integer3);
            s21 = r5.getMillis();
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            d96 = l42.clone();
            l42.add(integer4, integer4, integer5, integer3, integer3, integer5, s21, integer4);
            y94.hashCode();
        }

        /*
         *Testcase Number:143
        */        @Test
        public void TestJunit143() {
            org.joda.time.Period y94;
            org.joda.time.Period r5;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Instant f8;
            org.joda.time.MutableInterval y41;
            org.joda.time.MutableInterval y75;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration f4;
            org.joda.time.Duration s32;
            org.joda.time.Duration t19;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            long long1;
            long long3;
            int integer3;
            int s21;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            f4 = org.joda.time.Duration.standardDays(long3);
            s32 = f4.multipliedBy(long3);
            t19 = org.joda.time.Duration.standardMinutes(long3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            r5 = y94.withMinutes(integer3);
            s21 = r5.getMillis();
            f8 = f20.toInstant();
            y94.hashCode();
        }

        /*
         *Testcase Number:144
        */        @Test
        public void TestJunit144() {
            org.joda.time.MonthDay b46;
            org.joda.time.MutableDateTime r7;
            long long3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMinuteOfDay(integer5);
            b46 = new org.joda.time.MonthDay(long3);
            b46.hashCode();
        }

        /*
         *Testcase Number:145
        */        @Test
        public void TestJunit145() {
            org.joda.time.Period y94;
            org.joda.time.Period r5;
            org.joda.time.Period s71;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.MutableInterval y75;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration f4;
            org.joda.time.Duration s32;
            org.joda.time.Duration t19;
            org.joda.time.YearMonth i66;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            f4 = org.joda.time.Duration.standardDays(long3);
            s32 = f4.multipliedBy(long3);
            t19 = org.joda.time.Duration.standardMinutes(long3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            r5 = y94.withMinutes(integer3);
            s71 = r5.plusDays(integer3);
            y94.toString();
        }

        /*
         *Testcase Number:146
        */        @Test
        public void TestJunit146() {
            org.joda.time.Period y94;
            org.joda.time.Period r5;
            org.joda.time.Period q99;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Duration l13;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration f4;
            org.joda.time.Duration s32;
            org.joda.time.Duration t19;
            org.joda.time.MutableInterval y41;
            org.joda.time.MutableInterval y75;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType o55;
            org.joda.time.PeriodType w78;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int integer3;
            int s21;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            o55 = p15.withDaysRemoved();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            f4 = org.joda.time.Duration.standardDays(long3);
            s32 = f4.multipliedBy(long3);
            t19 = org.joda.time.Duration.standardMinutes(long3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            r5 = y94.withMinutes(integer3);
            s21 = r5.getMillis();
            q99 = r5.withMinutes(integer5);
            assertTrue(y94.equals(y94));
        }

        /*
         *Testcase Number:147
        */        @Test
        public void TestJunit147() {
            org.joda.time.DateTime e69;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.LocalTime p63;
            org.joda.time.MonthDay d81;
            org.joda.time.MonthDay d67;
            org.joda.time.MutablePeriod l42;
            org.joda.time.IllegalInstantException c84;
            org.joda.time.IllegalInstantException f91;
            org.joda.time.PeriodType p15;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            long long2;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int integer3;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            java.lang.String a43;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            d81 = new org.joda.time.MonthDay(long2);
            d67 = d81.withDayOfMonth(integer5);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            f91 = new org.joda.time.IllegalInstantException(a43);
            p63 = e6.withHourOfDay(integer5);
            e69.equals(e69);
        }

        /*
         *Testcase Number:148
        */        @Test
        public void TestJunit148() {
            org.joda.time.Partial p78;
            int[] x81;
            int[] y13;
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            y13 = p78.getValues();
            p78.hashCode();
        }

        /*
         *Testcase Number:149
        */        @Test
        public void TestJunit149() {
            org.joda.time.DateTimeComparator p47;
            org.joda.time.DateTimeFieldType w20;
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            assertTrue(p47.equals(p47));
        }

        /*
         *Testcase Number:150
        */        @Test
        public void TestJunit150() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.YearMonth i66;
            org.joda.time.DateTime e69;
            org.joda.time.MonthDay d81;
            org.joda.time.MutablePeriod x96;
            org.joda.time.PeriodType h34;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            long long2;
            int integer3;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMonthOfYear(integer3);
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            d81 = new org.joda.time.MonthDay(long2);
            h34 = org.joda.time.PeriodType.millis();
            x96 = new org.joda.time.MutablePeriod(long3, long2, h34);
            assertTrue(z86.equals(z86));
        }

        /*
         *Testcase Number:151
        */        @Test
        public void TestJunit151() {
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.Seconds z17;
            org.joda.time.Weeks r40;
            org.joda.time.Hours w14;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int j57;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            z17 = r40.toStandardSeconds();
            w14 = r40.toStandardHours();
            d8.toString();
        }

        /*
         *Testcase Number:152
        */        @Test
        public void TestJunit152() {
            org.joda.time.Period p94;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            p94 = org.joda.time.Period.minutes(integer3);
            p94.toString();
        }

        /*
         *Testcase Number:153
        */        @Test
        public void TestJunit153() {
            org.joda.time.Period m38;
            org.joda.time.Period j94;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.PeriodType v51;
            long long1;
            long long3;
            int integer3;
            v51 = org.joda.time.PeriodType.years();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            j94 = m38.normalizedStandard(v51);
            m38.toString();
        }

        /*
         *Testcase Number:154
        */        @Test
        public void TestJunit154() {
            org.joda.time.DateTime e69;
            org.joda.time.MonthDay d81;
            long long2;
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            d81 = new org.joda.time.MonthDay(long2);
            org.joda.time.DateTimeUtils.setCurrentMillisFixed(long2);
            e69.hashCode();
        }

        /*
         *Testcase Number:155
        */        @Test
        public void TestJunit155() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration m68;
            org.joda.time.LocalTime e6;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth a14;
            org.joda.time.DateTimeFieldType[] y68;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            m68 = org.joda.time.Duration.millis(long1);
            y68 = i66.getFieldTypes();
            z86.toString();
        }

        /*
         *Testcase Number:156
        */        @Test
        public void TestJunit156() {
            org.joda.time.Period m38;
            org.joda.time.Weeks r40;
            org.joda.time.Hours w14;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration d58;
            org.joda.time.LocalTime e6;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth a14;
            org.joda.time.DateTime e69;
            org.joda.time.MonthDay d81;
            org.joda.time.MonthDay d67;
            org.joda.time.LocalDateTime o85;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int j57;
            int integer3;
            int g59;
            int e27;
            long long1;
            long long3;
            long long2;
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.Seconds z17;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Instant e28;
            org.joda.time.MutableInterval y41;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            z17 = r40.toStandardSeconds();
            w14 = r40.toStandardHours();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            g59 = e6.getSecondOfMinute();
            e27 = e6.getSecondOfMinute();
            integer5 = 2;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            d58 = b98.multipliedBy(long3);
            e28 = z86.withMillis(long3);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            d81 = new org.joda.time.MonthDay(long2);
            d67 = d81.withDayOfMonth(integer5);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            o85 = new org.joda.time.LocalDateTime(integer1, integer3, integer5, integer3, integer5, integer1);
            m38.equals(m38);
        }

        /*
         *Testcase Number:157
        */        @Test
        public void TestJunit157() {
            org.joda.time.Period j2;
            org.joda.time.Period m38;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Instant e28;
            org.joda.time.MutableInterval y41;
            org.joda.time.MutableInterval y75;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration f4;
            org.joda.time.Duration s32;
            org.joda.time.Duration t19;
            org.joda.time.Duration d58;
            org.joda.time.LocalTime e6;
            org.joda.time.MutablePeriod x32;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int c30;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            f4 = org.joda.time.Duration.standardDays(long3);
            s32 = f4.multipliedBy(long3);
            t19 = org.joda.time.Duration.standardMinutes(long3);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            j2 = org.joda.time.Period.months(integer4);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            d58 = b98.multipliedBy(long3);
            e28 = z86.withMillis(long3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            c30 = e6.getMillisOfDay();
            integer2 = 10;
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            r7.setDate(c30, integer2, integer5);
            x32 = new org.joda.time.MutablePeriod(integer3, integer4, integer3, integer1);
            assertTrue(j2.equals(j2));
        }

        /*
         *Testcase Number:158
        */        @Test
        public void TestJunit158() {
            org.joda.time.MutableInterval y41;
            org.joda.time.LocalTime e6;
            long long3;
            int c30;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            c30 = e6.getMillisOfDay();
            org.joda.time.DateTimeUtils.setCurrentMillisOffset(long3);
            y41.hashCode();
        }

        /*
         *Testcase Number:159
        */        @Test
        public void TestJunit159() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.YearMonth i66;
            org.joda.time.DateTime e69;
            org.joda.time.MonthDay d81;
            org.joda.time.MutablePeriod x96;
            org.joda.time.PeriodType h34;
            org.joda.time.PeriodType y57;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            long long2;
            int integer3;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMonthOfYear(integer3);
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            d81 = new org.joda.time.MonthDay(long2);
            h34 = org.joda.time.PeriodType.millis();
            x96 = new org.joda.time.MutablePeriod(long3, long2, h34);
            y57 = h34.withMinutesRemoved();
            assertTrue(z86.equals(z86));
        }

        /*
         *Testcase Number:160
        */        @Test
        public void TestJunit160() {
            org.joda.time.Period s37;
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.Weeks r40;
            org.joda.time.Weeks q29;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int j57;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            s37 = org.joda.time.Period.days(integer2);
            q29 = r40.plus(r40);
            assertTrue(s37.equals(s37));
        }

        /*
         *Testcase Number:161
        */        @Test
        public void TestJunit161() {
            org.joda.time.MutablePeriod u47;
            u47 = new org.joda.time.MutablePeriod();
            u47.equals(u47);
        }

        /*
         *Testcase Number:162
        */        @Test
        public void TestJunit162() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth a14;
            org.joda.time.YearMonth g66;
            org.joda.time.MutableDateTime r7;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            int integer3;
            int g59;
            int e27;
            long long1;
            long long3;
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            g59 = e6.getSecondOfMinute();
            e27 = e6.getSecondOfMinute();
            g66 = i66.plusMonths(integer4);
            assertTrue(z86.equals(z86));
        }

        /*
         *Testcase Number:163
        */        @Test
        public void TestJunit163() {
            org.joda.time.PeriodType c19;
            c19 = org.joda.time.PeriodType.yearMonthDayTime();
            c19.hashCode();
        }

        /*
         *Testcase Number:164
        */        @Test
        public void TestJunit164() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.LocalTime y35;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth a14;
            org.joda.time.DateTimeFieldType[] g81;
            long long1;
            long long3;
            int integer3;
            int g59;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            g81 = a14.getFieldTypes();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            g59 = e6.getSecondOfMinute();
            y35 = e6.withMillisOfSecond(integer3);
            assertTrue(z86.equals(z86));
        }

        /*
         *Testcase Number:165
        */        @Test
        public void TestJunit165() {
            org.joda.time.Period m38;
            org.joda.time.Period y37;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration d58;
            org.joda.time.YearMonth i66;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer3;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            long3 = 10;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            d58 = b98.multipliedBy(long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMillisOfDay(integer3);
            y37 = org.joda.time.Period.hours(integer3);
            r7.setDayOfMonth(integer3);
            assertTrue(m38.equals(m38));
        }

        /*
         *Testcase Number:166
        */        @Test
        public void TestJunit166() {
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.LocalTime h68;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            long long3;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            h68 = new org.joda.time.LocalTime(long3);
            assertTrue(y41.equals(y41));
        }

        /*
         *Testcase Number:167
        */        @Test
        public void TestJunit167() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            java.lang.Object d96;
            org.joda.time.MutablePeriod l42;
            long long1;
            long long3;
            int integer3;
            int c48;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            d96 = l42.clone();
            c48 = e6.getMillisOfSecond();
            assertTrue(z86.equals(z86));
        }

        /*
         *Testcase Number:168
        */        @Test
        public void TestJunit168() {
            org.joda.time.Period m38;
            org.joda.time.Weeks r40;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration d58;
            org.joda.time.Duration l13;
            org.joda.time.Hours w14;
            org.joda.time.MutablePeriod c54;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.LocalDateTime t79;
            org.joda.time.PeriodType y44;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType o55;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int j57;
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.Seconds z17;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Instant e28;
            org.joda.time.MutableInterval y41;
            java.lang.String a43;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            d58 = b98.multipliedBy(long3);
            e28 = z86.withMillis(long3);
            long3 = 10;
            y44 = org.joda.time.PeriodType.yearWeekDay();
            c54 = new org.joda.time.MutablePeriod(long3, long3, y44);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            r7.setMillisOfDay(integer3);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            o55 = p15.withDaysRemoved();
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMinuteOfDay(integer5);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            z17 = r40.toStandardSeconds();
            w14 = r40.toStandardHours();
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            t79 = new org.joda.time.LocalDateTime(integer3, integer3, integer4, integer4, integer5, integer5, integer4);
            assertTrue(m38.equals(m38));
        }

        /*
         *Testcase Number:169
        */        @Test
        public void TestJunit169() {
            org.joda.time.MutableDateTime r7;
            int integer3;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            long long3;
            integer3 = 6;
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setSecondOfDay(integer3);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            org.joda.time.DateTimeUtils.setCurrentMillisOffset(long3);
            r7.setMinuteOfHour(integer5);
            assertTrue(r7.equals(r7));
        }

        /*
         *Testcase Number:170
        */        @Test
        public void TestJunit170() {
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.Weeks r40;
            org.joda.time.Hours f30;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            f30 = r40.toStandardHours();
            d8.hashCode();
        }

        /*
         *Testcase Number:171
        */        @Test
        public void TestJunit171() {
            boolean g70;
            boolean g71;
            org.joda.time.Seconds d8;
            org.joda.time.Seconds z17;
            org.joda.time.Weeks r40;
            org.joda.time.Hours w14;
            org.joda.time.Hours f30;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int j57;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            z17 = r40.toStandardSeconds();
            w14 = r40.toStandardHours();
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            f30 = r40.toStandardHours();
            g71 = f30.isLessThan(w14);
            assertTrue(d8.equals(d8));
        }

        /*
         *Testcase Number:172
        */        @Test
        public void TestJunit172() {
            org.joda.time.Period m38;
            org.joda.time.Period r25;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.YearMonth i66;
            org.joda.time.DateTime e69;
            org.joda.time.MonthDay d81;
            org.joda.time.MutablePeriod x96;
            org.joda.time.PeriodType h34;
            org.joda.time.PeriodType y57;
            org.joda.time.PeriodType d44;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            long long2;
            int integer3;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMonthOfYear(integer3);
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            d81 = new org.joda.time.MonthDay(long2);
            h34 = org.joda.time.PeriodType.millis();
            x96 = new org.joda.time.MutablePeriod(long3, long2, h34);
            y57 = h34.withMinutesRemoved();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            d44 = org.joda.time.PeriodType.dayTime();
            r25 = new org.joda.time.Period(long2, long3, d44);
            assertTrue(m38.equals(m38));
        }

        /*
         *Testcase Number:173
        */        @Test
        public void TestJunit173() {
            org.joda.time.Partial p78;
            org.joda.time.Chronology g32;
            int[] x81;
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            p78.equals(p78);
        }

        /*
         *Testcase Number:174
        */        @Test
        public void TestJunit174() {
            org.joda.time.Instant y40;
            org.joda.time.MutableDateTime r7;
            int integer3;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            long long3;
            integer3 = 6;
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setSecondOfDay(integer3);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            org.joda.time.DateTimeUtils.setCurrentMillisOffset(long3);
            r7.setMinuteOfHour(integer5);
            y40 = org.joda.time.Instant.ofEpochSecond(long3);
            y40.equals(y40);
        }

        /*
         *Testcase Number:175
        */        @Test
        public void TestJunit175() {
            org.joda.time.Period y94;
            org.joda.time.Period r5;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.MutableInterval y75;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration f4;
            org.joda.time.Duration s32;
            org.joda.time.Duration t19;
            org.joda.time.LocalTime e6;
            org.joda.time.LocalTime i78;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth a14;
            org.joda.time.MutablePeriod g78;
            org.joda.time.DateTimeFieldType[] g81;
            org.joda.time.PeriodType w78;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            f4 = org.joda.time.Duration.standardDays(long3);
            s32 = f4.multipliedBy(long3);
            t19 = org.joda.time.Duration.standardMinutes(long3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            r5 = y94.withMinutes(integer3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            g81 = a14.getFieldTypes();
            i78 = e6.withMinuteOfHour(integer3);
            assertTrue(y94.equals(y94));
        }

        /*
         *Testcase Number:176
        */        @Test
        public void TestJunit176() {
            org.joda.time.Period m38;
            org.joda.time.Partial p78;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration l13;
            org.joda.time.Duration d58;
            org.joda.time.Chronology g32;
            org.joda.time.MonthDay i63;
            int[] x81;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType i68;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            org.joda.time.LocalDate k1;
            org.joda.time.Years g96;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            java.lang.String a43;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            r7.setMillisOfDay(integer3);
            i63 = new org.joda.time.MonthDay(long3);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            i68 = g96.getPeriodType();
            long3 = 10;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            d58 = b98.multipliedBy(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            k1 = new org.joda.time.LocalDate(integer5, integer4, integer3, g32);
            m38.hashCode();
        }

        /*
         *Testcase Number:177
        */        @Test
        public void TestJunit177() {
            org.joda.time.LocalDate h14;
            org.joda.time.Partial p78;
            org.joda.time.Chronology g32;
            int[] x81;
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            h14.toString();
        }

        /*
         *Testcase Number:178
        */        @Test
        public void TestJunit178() {
            org.joda.time.MonthDay v57;
            org.joda.time.MutableDateTime r7;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            long long3;
            integer4 = 4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            org.joda.time.DateTimeUtils.setCurrentMillisOffset(long3);
            v57 = new org.joda.time.MonthDay(integer4, integer5);
            assertTrue(v57.equals(v57));
        }

        /*
         *Testcase Number:179
        */        @Test
        public void TestJunit179() {
            org.joda.time.Period m38;
            org.joda.time.Period u99;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Instant e28;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration d58;
            org.joda.time.YearMonth i66;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMillisOfDay(integer3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            d58 = b98.multipliedBy(long3);
            e28 = z86.withMillis(long3);
            u99 = m38.minusMillis(integer5);
            m38.equals(m38);
        }

        /*
         *Testcase Number:180
        */        @Test
        public void TestJunit180() {
            org.joda.time.LocalDate h14;
            org.joda.time.Partial p78;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Chronology g32;
            org.joda.time.YearMonth x86;
            int[] x81;
            long long3;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            h14.equals(h14);
        }

        /*
         *Testcase Number:181
        */        @Test
        public void TestJunit181() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.MutablePeriod l42;
            java.lang.String a43;
            org.joda.time.IllegalInstantException c84;
            org.joda.time.IllegalInstantException f91;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType c51;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            f91 = new org.joda.time.IllegalInstantException(a43);
            c51 = p15.withSecondsRemoved();
            assertTrue(z86.equals(z86));
        }

        /*
         *Testcase Number:182
        */        @Test
        public void TestJunit182() {
            org.joda.time.PeriodType a2;
            a2 = org.joda.time.PeriodType.standard();
            a2.equals(a2);
        }

        /*
         *Testcase Number:183
        */        @Test
        public void TestJunit183() {
            org.joda.time.Period m38;
            org.joda.time.Period m70;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            long long1;
            long long3;
            long i68;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            m70 = m38.normalizedStandard();
            i68 = b98.getStandardHours();
            assertTrue(m38.equals(m38));
        }

        /*
         *Testcase Number:184
        */        @Test
        public void TestJunit184() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.YearMonth i66;
            org.joda.time.DateTime e69;
            org.joda.time.MonthDay d81;
            org.joda.time.MutablePeriod x96;
            org.joda.time.PeriodType h34;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            long long2;
            int integer3;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMillisOfDay(integer3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMonthOfYear(integer3);
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            d81 = new org.joda.time.MonthDay(long2);
            h34 = org.joda.time.PeriodType.millis();
            x96 = new org.joda.time.MutablePeriod(long3, long2, h34);
            y41.setDurationBeforeEnd(long3);
            z86.equals(z86);
        }

        /*
         *Testcase Number:185
        */        @Test
        public void TestJunit185() {
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.Seconds z17;
            org.joda.time.Weeks r40;
            org.joda.time.Hours w14;
            org.joda.time.Hours f30;
            org.joda.time.Hours i94;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int j57;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            z17 = r40.toStandardSeconds();
            w14 = r40.toStandardHours();
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            f30 = r40.toStandardHours();
            i94 = f30.minus(w14);
            assertTrue(d8.equals(d8));
        }

        /*
         *Testcase Number:186
        */        @Test
        public void TestJunit186() {
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.Seconds z17;
            org.joda.time.Weeks r40;
            org.joda.time.Hours w14;
            org.joda.time.Days m20;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int j57;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            z17 = r40.toStandardSeconds();
            w14 = r40.toStandardHours();
            m20 = r40.toStandardDays();
            assertTrue(d8.equals(d8));
        }

        /*
         *Testcase Number:187
        */        @Test
        public void TestJunit187() {
            org.joda.time.Period j2;
            org.joda.time.Period l57;
            org.joda.time.MonthDay v57;
            org.joda.time.MutableDateTime r7;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            long long3;
            integer4 = 4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            org.joda.time.DateTimeUtils.setCurrentMillisOffset(long3);
            v57 = new org.joda.time.MonthDay(integer4, integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            j2 = org.joda.time.Period.months(integer4);
            l57 = j2.withWeeks(integer4);
            assertTrue(j2.equals(j2));
        }

        /*
         *Testcase Number:188
        */        @Test
        public void TestJunit188() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.DateTime e69;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.YearMonth i66;
            org.joda.time.MonthDay d81;
            org.joda.time.MutableDateTime r7;
            long long2;
            long long1;
            long long3;
            int integer3;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            d81 = new org.joda.time.MonthDay(long2);
            org.joda.time.DateTimeUtils.setCurrentMillisFixed(long2);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMonthOfYear(integer3);
            r7.setMillis(long2);
            z86.equals(z86);
        }

        /*
         *Testcase Number:189
        */        @Test
        public void TestJunit189() {
            org.joda.time.DateTimeComparator t4;
            t4 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            t4.toString();
        }

        /*
         *Testcase Number:190
        */        @Test
        public void TestJunit190() {
            org.joda.time.MonthDay g47;
            g47 = new org.joda.time.MonthDay();
            g47.hashCode();
        }

        /*
         *Testcase Number:191
        */        @Test
        public void TestJunit191() {
            org.joda.time.DateTimeComparator p47;
            org.joda.time.DateTimeComparator b73;
            org.joda.time.DateTimeFieldType w20;
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            b73 = org.joda.time.DateTimeComparator.getInstance(w20, w20);
            p47.equals(p47);
        }

        /*
         *Testcase Number:192
        */        @Test
        public void TestJunit192() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration f4;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            f4 = org.joda.time.Duration.standardMinutes(long3);
            z86.toString();
        }

        /*
         *Testcase Number:193
        */        @Test
        public void TestJunit193() {
            org.joda.time.Period y94;
            org.joda.time.Period r5;
            org.joda.time.Period l82;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.MutableInterval y75;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration f4;
            org.joda.time.Duration s32;
            org.joda.time.Duration t19;
            org.joda.time.YearMonth i66;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            f4 = org.joda.time.Duration.standardDays(long3);
            s32 = f4.multipliedBy(long3);
            t19 = org.joda.time.Duration.standardMinutes(long3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            r5 = y94.withMinutes(integer3);
            l82 = r5.minusSeconds(integer3);
            y94.equals(y94);
        }

        /*
         *Testcase Number:194
        */        @Test
        public void TestJunit194() {
            org.joda.time.Period m38;
            org.joda.time.Period m70;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Instant n57;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            java.lang.Object d96;
            org.joda.time.MutablePeriod l42;
            long long1;
            long long3;
            int integer3;
            int c48;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            m70 = m38.normalizedStandard();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            d96 = l42.clone();
            c48 = e6.getMillisOfSecond();
            n57 = f20.minus(long3);
            m38.toString();
        }

        /*
         *Testcase Number:195
        */        @Test
        public void TestJunit195() {
            org.joda.time.Period m38;
            org.joda.time.Period j94;
            org.joda.time.Period m70;
            org.joda.time.Partial p78;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration d58;
            org.joda.time.Duration l13;
            org.joda.time.Chronology g32;
            org.joda.time.YearMonth x86;
            org.joda.time.LocalTime q36;
            int[] x81;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType v51;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType o55;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int s7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            org.joda.time.LocalDate h14;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Instant e28;
            org.joda.time.MutableInterval y41;
            java.lang.String a43;
            v51 = org.joda.time.PeriodType.years();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            j94 = m38.normalizedStandard(v51);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            m70 = m38.normalizedStandard();
            s7 = m70.getMonths();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            d58 = b98.multipliedBy(long3);
            e28 = z86.withMillis(long3);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            o55 = p15.withDaysRemoved();
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            q36 = new org.joda.time.LocalTime(integer3, integer3, integer3, integer5, g32);
            m38.toString();
        }

        /*
         *Testcase Number:196
        */        @Test
        public void TestJunit196() {
            org.joda.time.Period y94;
            org.joda.time.Period g38;
            org.joda.time.Period u94;
            org.joda.time.Period y37;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth e21;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            org.joda.time.MutableDateTime r7;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long long3;
            long long1;
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            integer5 = 2;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            g38 = y94.withDays(integer5);
            u94 = g38.withYears(integer2);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMillisOfDay(integer3);
            y37 = org.joda.time.Period.hours(integer3);
            e21 = i66.minusYears(integer4);
            y94.toString();
        }

        /*
         *Testcase Number:197
        */        @Test
        public void TestJunit197() {
            org.joda.time.DateTimeComparator p47;
            org.joda.time.DateTimeComparator b73;
            org.joda.time.MonthDay b46;
            org.joda.time.DateTimeFieldType w20;
            org.joda.time.MutableDateTime r7;
            long long3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            b73 = org.joda.time.DateTimeComparator.getInstance(w20, w20);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            org.joda.time.DateTimeUtils.setCurrentMillisOffset(long3);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMinuteOfDay(integer5);
            b46 = new org.joda.time.MonthDay(long3);
            r7.set(w20, integer1);
            assertTrue(p47.equals(p47));
        }

        /*
         *Testcase Number:198
        */        @Test
        public void TestJunit198() {
            org.joda.time.Period m38;
            org.joda.time.Period m70;
            org.joda.time.Period w95;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.MutableInterval y75;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration f4;
            org.joda.time.Duration s32;
            org.joda.time.Duration t19;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth n4;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            f4 = org.joda.time.Duration.standardDays(long3);
            s32 = f4.multipliedBy(long3);
            t19 = org.joda.time.Duration.standardMinutes(long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            m70 = m38.normalizedStandard();
            w95 = m38.minusHours(integer3);
            n4 = i66.plusYears(integer3);
            m38.hashCode();
        }

        /*
         *Testcase Number:199
        */        @Test
        public void TestJunit199() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.DateTime e69;
            org.joda.time.YearMonth i66;
            org.joda.time.LocalTime e6;
            org.joda.time.MonthDay d81;
            java.lang.Object d96;
            org.joda.time.MutablePeriod l42;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            long long2;
            int integer3;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            d81 = new org.joda.time.MonthDay(long2);
            org.joda.time.DateTimeUtils.setCurrentMillisFixed(long2);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMonthOfYear(integer3);
            r7.setMillis(long2);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            d96 = l42.clone();
            l42.setPeriod(long3, long2);
            z86.hashCode();
        }

        /*
         *Testcase Number:200
        */        @Test
        public void TestJunit200() {
            org.joda.time.LocalDate h14;
            org.joda.time.Partial p78;
            org.joda.time.Chronology g32;
            org.joda.time.LocalTime p68;
            int[] x81;
            org.joda.time.MutableDateTime r7;
            long long3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMinuteOfDay(integer5);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            p68 = org.joda.time.LocalTime.fromMillisOfDay(long3, g32);
            h14.hashCode();
        }

        /*
         *Testcase Number:201
        */        @Test
        public void TestJunit201() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.MutablePeriod l42;
            java.lang.String a43;
            org.joda.time.IllegalInstantException c84;
            org.joda.time.IllegalInstantException f91;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType c51;
            long long1;
            long long3;
            int integer3;
            int t39;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            f91 = new org.joda.time.IllegalInstantException(a43);
            c51 = p15.withSecondsRemoved();
            t39 = e6.getMillisOfSecond();
            z86.toString();
        }

        /*
         *Testcase Number:202
        */        @Test
        public void TestJunit202() {
            org.joda.time.Instant y40;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.DateTime e69;
            org.joda.time.MutablePeriod g78;
            org.joda.time.MutablePeriod z22;
            org.joda.time.PeriodType w78;
            org.joda.time.MutableDateTime r7;
            int integer3;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            long long3;
            long long1;
            long long2;
            integer3 = 6;
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setSecondOfDay(integer3);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            org.joda.time.DateTimeUtils.setCurrentMillisOffset(long3);
            r7.setMinuteOfHour(integer5);
            y40 = org.joda.time.Instant.ofEpochSecond(long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            y41.setDurationBeforeEnd(long2);
            g78.add(long3);
            z22 = g78.copy();
            g78.addYears(integer4);
            y40.toString();
        }

        /*
         *Testcase Number:203
        */        @Test
        public void TestJunit203() {
            org.joda.time.DateTime c76;
            c76 = new org.joda.time.DateTime();
            assertTrue(c76.equals(c76));
        }

        /*
         *Testcase Number:204
        */        @Test
        public void TestJunit204() {
            org.joda.time.LocalDate h14;
            org.joda.time.Partial p78;
            org.joda.time.MutableInterval y75;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Chronology g32;
            org.joda.time.YearMonth x86;
            org.joda.time.YearMonth l50;
            int[] x81;
            long long1;
            long long3;
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            l50 = new org.joda.time.YearMonth(long3, g32);
            h14.equals(h14);
        }

        /*
         *Testcase Number:205
        */        @Test
        public void TestJunit205() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth a14;
            org.joda.time.DateTimeFieldType[] g81;
            long long1;
            long long3;
            int integer3;
            int r11;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            g81 = a14.getFieldTypes();
            r11 = e6.getMinuteOfHour();
            z86.equals(z86);
        }

        /*
         *Testcase Number:206
        */        @Test
        public void TestJunit206() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.MutablePeriod l42;
            java.lang.String a43;
            org.joda.time.IllegalInstantException c84;
            org.joda.time.IllegalInstantException f91;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType c51;
            long long1;
            long long3;
            int integer3;
            int h37;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            f91 = new org.joda.time.IllegalInstantException(a43);
            c51 = p15.withSecondsRemoved();
            h37 = e6.getMillisOfSecond();
            z86.equals(z86);
        }

        /*
         *Testcase Number:207
        */        @Test
        public void TestJunit207() {
            org.joda.time.Period s37;
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.Weeks r40;
            org.joda.time.Weeks a8;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int j57;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            s37 = org.joda.time.Period.days(integer2);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            s37 = org.joda.time.Period.days(integer2);
            a8 = r40.plus(r40);
            s37.equals(s37);
        }

        /*
         *Testcase Number:208
        */        @Test
        public void TestJunit208() {
            org.joda.time.Period j2;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int k22;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            j2 = org.joda.time.Period.months(integer4);
            k22 = r7.getRoundingMode();
            j2.toString();
        }

        /*
         *Testcase Number:209
        */        @Test
        public void TestJunit209() {
            org.joda.time.DateTime s29;
            s29 = new org.joda.time.DateTime();
            s29.equals(s29);
        }

        /*
         *Testcase Number:210
        */        @Test
        public void TestJunit210() {
            org.joda.time.PeriodType i80;
            org.joda.time.PeriodType c24;
            i80 = org.joda.time.PeriodType.standard();
            c24 = i80.withYearsRemoved();
            i80.equals(i80);
        }

        /*
         *Testcase Number:211
        */        @Test
        public void TestJunit211() {
            org.joda.time.Period s37;
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.Seconds r37;
            org.joda.time.Weeks r40;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int j57;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            s37 = org.joda.time.Period.days(integer2);
            r37 = d8.plus(d8);
            s37.toString();
        }

        /*
         *Testcase Number:212
        */        @Test
        public void TestJunit212() {
            org.joda.time.Period s37;
            org.joda.time.Period j2;
            org.joda.time.Weeks r40;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.YearMonth i66;
            org.joda.time.DateTime e69;
            org.joda.time.LocalTime g79;
            org.joda.time.MonthDay d81;
            org.joda.time.MutablePeriod x96;
            org.joda.time.PeriodType h34;
            org.joda.time.PeriodType y57;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int j57;
            int k22;
            int integer3;
            long long1;
            long long3;
            long long2;
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            s37 = org.joda.time.Period.days(integer2);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            j2 = org.joda.time.Period.months(integer4);
            k22 = r7.getRoundingMode();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMonthOfYear(integer3);
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            d81 = new org.joda.time.MonthDay(long2);
            h34 = org.joda.time.PeriodType.millis();
            x96 = new org.joda.time.MutablePeriod(long3, long2, h34);
            y57 = h34.withMinutesRemoved();
            g79 = new org.joda.time.LocalTime(integer2, integer5, integer5);
            assertTrue(s37.equals(s37));
        }

        /*
         *Testcase Number:213
        */        @Test
        public void TestJunit213() {
            org.joda.time.LocalDate h14;
            org.joda.time.DateTimeComparator p47;
            org.joda.time.DateTimeComparator b73;
            org.joda.time.Partial p78;
            org.joda.time.Partial a4;
            org.joda.time.Chronology g32;
            org.joda.time.DateTimeFieldType w20;
            int[] x81;
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            b73 = org.joda.time.DateTimeComparator.getInstance(w20, w20);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            a4 = p78.without(w20);
            h14.hashCode();
        }

        /*
         *Testcase Number:214
        */        @Test
        public void TestJunit214() {
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.Seconds z17;
            org.joda.time.Weeks r40;
            org.joda.time.Hours w14;
            org.joda.time.Days m20;
            org.joda.time.Days m9;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int j57;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            z17 = r40.toStandardSeconds();
            w14 = r40.toStandardHours();
            m20 = r40.toStandardDays();
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            z17 = r40.toStandardSeconds();
            w14 = r40.toStandardHours();
            m20 = r40.toStandardDays();
            m9 = m20.plus(m20);
            d8.equals(d8);
        }

        /*
         *Testcase Number:215
        */        @Test
        public void TestJunit215() {
            org.joda.time.Weeks r40;
            org.joda.time.Duration l13;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.MutablePeriod l42;
            org.joda.time.PeriodType p15;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int j57;
            int integer3;
            long long3;
            long long1;
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.Seconds z17;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            java.lang.String a43;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            z17 = r40.toStandardSeconds();
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y41.setDurationAfterStart(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            l42.setValue(integer4, integer5);
            r40.hashCode();
        }

        /*
         *Testcase Number:216
        */        @Test
        public void TestJunit216() {
            org.joda.time.Period m38;
            org.joda.time.Period m70;
            org.joda.time.Period w42;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            long long1;
            long long3;
            long i68;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            m70 = m38.normalizedStandard();
            i68 = b98.getStandardHours();
            w42 = m38.toPeriod();
            assertTrue(m38.equals(m38));
        }

        /*
         *Testcase Number:217
        */        @Test
        public void TestJunit217() {
            org.joda.time.DateTime e69;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration v85;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            long long2;
            long long3;
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            y41.setDurationBeforeEnd(long2);
            v85 = org.joda.time.Duration.millis(long3);
            e69.toString();
        }

        /*
         *Testcase Number:218
        */        @Test
        public void TestJunit218() {
            org.joda.time.Partial p78;
            org.joda.time.Duration l13;
            org.joda.time.Duration y79;
            org.joda.time.Chronology g32;
            org.joda.time.YearMonth x86;
            org.joda.time.YearMonth l50;
            org.joda.time.LocalTime f78;
            int[] x81;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType o55;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            org.joda.time.LocalDate h14;
            org.joda.time.MutableInterval y75;
            org.joda.time.MutableInterval y41;
            java.lang.String a43;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            o55 = p15.withDaysRemoved();
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            l50 = new org.joda.time.YearMonth(long3, g32);
            f78 = new org.joda.time.LocalTime(long3, g32);
            p78.equals(p78);
        }

        /*
         *Testcase Number:219
        */        @Test
        public void TestJunit219() {
            org.joda.time.Period y94;
            org.joda.time.Period r5;
            org.joda.time.Partial p78;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration f4;
            org.joda.time.Duration s32;
            org.joda.time.Duration t19;
            org.joda.time.Chronology g32;
            org.joda.time.YearMonth x86;
            org.joda.time.YearMonth s46;
            int[] x81;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            long long1;
            long long3;
            int integer3;
            int s21;
            org.joda.time.LocalDate h14;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.MutableInterval y75;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            f4 = org.joda.time.Duration.standardDays(long3);
            s32 = f4.multipliedBy(long3);
            t19 = org.joda.time.Duration.standardMinutes(long3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            r5 = y94.withMinutes(integer3);
            s21 = r5.getMillis();
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            s46 = x86.plusMonths(integer3);
            y94.hashCode();
        }

        /*
         *Testcase Number:220
        */        @Test
        public void TestJunit220() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.LocalTime s86;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            s86 = new org.joda.time.LocalTime(long3);
            z86.toString();
        }

        /*
         *Testcase Number:221
        */        @Test
        public void TestJunit221() {
            org.joda.time.MutablePeriod u53;
            u53 = new org.joda.time.MutablePeriod();
            u53.toString();
        }

        /*
         *Testcase Number:222
        */        @Test
        public void TestJunit222() {
            org.joda.time.Partial p78;
            org.joda.time.Period c6;
            org.joda.time.Chronology g32;
            int[] x81;
            org.joda.time.MutableDateTime r7;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            c6 = new org.joda.time.Period(long1, g32);
            p78.hashCode();
        }

        /*
         *Testcase Number:223
        */        @Test
        public void TestJunit223() {
            org.joda.time.DateTimeComparator p47;
            org.joda.time.DateTimeComparator b73;
            org.joda.time.Partial p78;
            org.joda.time.Partial x33;
            org.joda.time.Instant y40;
            org.joda.time.MonthDay b46;
            org.joda.time.DateTimeFieldType w20;
            org.joda.time.MutableDateTime r7;
            long long3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int integer3;
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            b73 = org.joda.time.DateTimeComparator.getInstance(w20, w20);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            org.joda.time.DateTimeUtils.setCurrentMillisOffset(long3);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMinuteOfDay(integer5);
            b46 = new org.joda.time.MonthDay(long3);
            r7.set(w20, integer1);
            integer3 = 6;
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setSecondOfDay(integer3);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            org.joda.time.DateTimeUtils.setCurrentMillisOffset(long3);
            r7.setMinuteOfHour(integer5);
            y40 = org.joda.time.Instant.ofEpochSecond(long3);
            p78 = new org.joda.time.Partial();
            x33 = p78.with(w20, integer4);
            p47.hashCode();
        }

        /*
         *Testcase Number:224
        */        @Test
        public void TestJunit224() {
            org.joda.time.Period f50;
            org.joda.time.MutableInterval y41;
            org.joda.time.PeriodType b85;
            long long1;
            long long3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            b85 = org.joda.time.PeriodType.yearMonthDay();
            f50 = new org.joda.time.Period(long1, long3, b85);
            f50.equals(f50);
        }

        /*
         *Testcase Number:225
        */        @Test
        public void TestJunit225() {
            org.joda.time.LocalTime q86;
            q86 = new org.joda.time.LocalTime();
            q86.toString();
        }

        /*
         *Testcase Number:226
        */        @Test
        public void TestJunit226() {
            org.joda.time.YearMonth k7;
            k7 = org.joda.time.YearMonth.now();
            k7.hashCode();
        }

        /*
         *Testcase Number:227
        */        @Test
        public void TestJunit227() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration f4;
            org.joda.time.LocalTime x83;
            int integer4;
            int integer3;
            long long1;
            long long3;
            integer4 = 4;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            f4 = org.joda.time.Duration.standardMinutes(long3);
            x83 = new org.joda.time.LocalTime(integer4, integer3);
            z86.toString();
        }

        /*
         *Testcase Number:228
        */        @Test
        public void TestJunit228() {
            org.joda.time.PeriodType g60;
            g60 = org.joda.time.PeriodType.time();
            assertTrue(g60.equals(g60));
        }

        /*
         *Testcase Number:229
        */        @Test
        public void TestJunit229() {
            org.joda.time.LocalDate h14;
            org.joda.time.Partial p78;
            org.joda.time.Chronology g32;
            org.joda.time.LocalTime p68;
            int[] x81;
            org.joda.time.LocalDateTime w30;
            org.joda.time.MutableDateTime r7;
            long long3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMinuteOfDay(integer5);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            p68 = org.joda.time.LocalTime.fromMillisOfDay(long3, g32);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMinuteOfDay(integer5);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            p68 = org.joda.time.LocalTime.fromMillisOfDay(long3, g32);
            w30 = h14.toLocalDateTime(p68);
            h14.toString();
        }

        /*
         *Testcase Number:230
        */        @Test
        public void TestJunit230() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth u22;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int integer3;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMillisOfDay(integer3);
            u22 = i66.minusMonths(integer1);
            assertTrue(z86.equals(z86));
        }

        /*
         *Testcase Number:231
        */        @Test
        public void TestJunit231() {
            boolean g70;
            boolean z22;
            org.joda.time.Seconds d8;
            org.joda.time.Seconds z17;
            org.joda.time.Weeks r40;
            org.joda.time.Hours w14;
            org.joda.time.Hours f30;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int j57;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            z17 = r40.toStandardSeconds();
            w14 = r40.toStandardHours();
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            f30 = r40.toStandardHours();
            z22 = f30.isGreaterThan(w14);
            d8.hashCode();
        }

        /*
         *Testcase Number:232
        */        @Test
        public void TestJunit232() {
            org.joda.time.Period j2;
            org.joda.time.Period y94;
            org.joda.time.Period g38;
            org.joda.time.Partial p78;
            org.joda.time.Duration y79;
            org.joda.time.Duration l13;
            org.joda.time.Chronology g32;
            org.joda.time.LocalTime p68;
            org.joda.time.DateTime q79;
            int[] x81;
            org.joda.time.MutablePeriod g78;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType w78;
            org.joda.time.PeriodType p15;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long long3;
            long long1;
            org.joda.time.LocalDate h14;
            org.joda.time.MutableInterval y41;
            java.lang.String a43;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            j2 = org.joda.time.Period.months(integer4);
            integer5 = 2;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            g38 = y94.withDays(integer5);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMinuteOfDay(integer5);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            p68 = org.joda.time.LocalTime.fromMillisOfDay(long3, g32);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y41.setDurationAfterStart(long1);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMinuteOfDay(integer5);
            q79 = new org.joda.time.DateTime(integer1, integer5, integer5, integer4, integer1);
            j2.toString();
        }

        /*
         *Testcase Number:233
        */        @Test
        public void TestJunit233() {
            org.joda.time.LocalDate h14;
            org.joda.time.Partial p78;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration f4;
            org.joda.time.Chronology g32;
            org.joda.time.YearMonth x86;
            org.joda.time.LocalTime x83;
            int[] x81;
            org.joda.time.MutablePeriod k48;
            long long3;
            long long1;
            int integer4;
            int integer3;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            integer4 = 4;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            f4 = org.joda.time.Duration.standardMinutes(long3);
            x83 = new org.joda.time.LocalTime(integer4, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            k48 = new org.joda.time.MutablePeriod(long3, long3, g32);
            h14.equals(h14);
        }

        /*
         *Testcase Number:234
        */        @Test
        public void TestJunit234() {
            org.joda.time.Years g96;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration l13;
            org.joda.time.LocalTime h68;
            org.joda.time.MutablePeriod g78;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType w78;
            org.joda.time.PeriodType p15;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            h68 = new org.joda.time.LocalTime(long3);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            r7.setTime(long3);
            g96.hashCode();
        }

        /*
         *Testcase Number:235
        */        @Test
        public void TestJunit235() {
            org.joda.time.Years g96;
            org.joda.time.Duration l13;
            org.joda.time.DateTime e69;
            org.joda.time.MonthDay d81;
            org.joda.time.MonthDay d67;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType p15;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            long l24;
            long long2;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            l24 = l13.getStandardSeconds();
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            d81 = new org.joda.time.MonthDay(long2);
            d67 = d81.withDayOfMonth(integer5);
            r7.setSecondOfMinute(integer4);
            assertTrue(g96.equals(g96));
        }

        /*
         *Testcase Number:236
        */        @Test
        public void TestJunit236() {
            org.joda.time.Partial p78;
            org.joda.time.Years g96;
            org.joda.time.Duration l13;
            org.joda.time.Chronology g32;
            int[] x81;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.LocalDateTime h87;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType i68;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            i68 = g96.getPeriodType();
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h87 = new org.joda.time.LocalDateTime(long1, g32);
            p78.toString();
        }

        /*
         *Testcase Number:237
        */        @Test
        public void TestJunit237() {
            org.joda.time.Period m38;
            org.joda.time.Period m70;
            org.joda.time.Period w95;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.YearMonth i66;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int integer3;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMinuteOfDay(integer5);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            m70 = m38.normalizedStandard();
            w95 = m38.minusHours(integer3);
            y41.setStartMillis(long3);
            m38.toString();
        }

        /*
         *Testcase Number:238
        */        @Test
        public void TestJunit238() {
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.YearMonth i66;
            org.joda.time.DateTime e69;
            org.joda.time.MonthDay i63;
            org.joda.time.MonthDay d81;
            org.joda.time.MutablePeriod l42;
            org.joda.time.MutablePeriod x96;
            org.joda.time.IllegalInstantException c84;
            org.joda.time.IllegalInstantException f91;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType c51;
            org.joda.time.PeriodType h34;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            long long2;
            int integer3;
            int t39;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            java.lang.String a43;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            f91 = new org.joda.time.IllegalInstantException(a43);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            f91 = new org.joda.time.IllegalInstantException(a43);
            c51 = p15.withSecondsRemoved();
            t39 = e6.getMillisOfSecond();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            r7.setMillisOfDay(integer3);
            i63 = new org.joda.time.MonthDay(long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMonthOfYear(integer3);
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            d81 = new org.joda.time.MonthDay(long2);
            h34 = org.joda.time.PeriodType.millis();
            x96 = new org.joda.time.MutablePeriod(long3, long2, h34);
            r7.setDate(integer3, t39, integer1);
            assertTrue(y79.equals(y79));
        }

        /*
         *Testcase Number:239
        */        @Test
        public void TestJunit239() {
            org.joda.time.Years g96;
            org.joda.time.Years c50;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration l13;
            org.joda.time.LocalTime e6;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth a14;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType p15;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int g59;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            g59 = e6.getSecondOfMinute();
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            c50 = g96.minus(integer3);
            assertTrue(g96.equals(g96));
        }

        /*
         *Testcase Number:240
        */        @Test
        public void TestJunit240() {
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.Weeks r40;
            org.joda.time.Duration l13;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int j57;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            r7.setTime(long3);
            d8.toString();
        }

        /*
         *Testcase Number:241
        */        @Test
        public void TestJunit241() {
            org.joda.time.Period m38;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Instant e28;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration d58;
            org.joda.time.MutablePeriod c54;
            org.joda.time.PeriodType y44;
            org.joda.time.PeriodType m3;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            d58 = b98.multipliedBy(long3);
            e28 = z86.withMillis(long3);
            long3 = 10;
            y44 = org.joda.time.PeriodType.yearWeekDay();
            c54 = new org.joda.time.MutablePeriod(long3, long3, y44);
            m3 = y44.withMinutesRemoved();
            assertTrue(m38.equals(m38));
        }

        /*
         *Testcase Number:242
        */        @Test
        public void TestJunit242() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Instant b82;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth a14;
            org.joda.time.DateTimeFieldType[] g81;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            g81 = a14.getFieldTypes();
            b82 = f20.toInstant();
            z86.toString();
        }

        /*
         *Testcase Number:243
        */        @Test
        public void TestJunit243() {
            org.joda.time.DateTimeComparator p47;
            org.joda.time.DateTimeComparator b73;
            org.joda.time.MonthDay b46;
            org.joda.time.DateTimeFieldType w20;
            org.joda.time.MutableDateTime r7;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long long3;
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            b73 = org.joda.time.DateTimeComparator.getInstance(w20, w20);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            org.joda.time.DateTimeUtils.setCurrentMillisOffset(long3);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMinuteOfDay(integer5);
            b46 = new org.joda.time.MonthDay(long3);
            r7.set(w20, integer1);
            r7.setTime(long3);
            p47.hashCode();
        }

        /*
         *Testcase Number:244
        */        @Test
        public void TestJunit244() {
            org.joda.time.Period s37;
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.Weeks r40;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int j57;
            long long3;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            s37 = org.joda.time.Period.days(integer2);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            org.joda.time.DateTimeUtils.setCurrentMillisOffset(long3);
            r7.setMinuteOfHour(integer2);
            assertTrue(s37.equals(s37));
        }

        /*
         *Testcase Number:245
        */        @Test
        public void TestJunit245() {
            boolean g70;
            boolean x90;
            org.joda.time.Seconds d8;
            org.joda.time.Seconds z17;
            org.joda.time.Weeks r40;
            org.joda.time.Hours w14;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int j57;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            z17 = r40.toStandardSeconds();
            w14 = r40.toStandardHours();
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            x90 = d8.isLessThan(d8);
            d8.hashCode();
        }

        /*
         *Testcase Number:246
        */        @Test
        public void TestJunit246() {
            org.joda.time.Period j2;
            org.joda.time.Partial p78;
            org.joda.time.Weeks r40;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration f4;
            org.joda.time.Duration l13;
            org.joda.time.LocalTime e6;
            org.joda.time.LocalTime x83;
            org.joda.time.Chronology g32;
            org.joda.time.YearMonth x86;
            org.joda.time.DateTime r38;
            int[] x81;
            org.joda.time.MutablePeriod l42;
            org.joda.time.MutablePeriod k48;
            org.joda.time.IllegalInstantException c84;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.LocalDateTime h87;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType i68;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int k22;
            int integer3;
            long long1;
            long long3;
            org.joda.time.LocalDate h14;
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.Years g96;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            java.lang.String a43;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            j2 = org.joda.time.Period.months(integer4);
            k22 = r7.getRoundingMode();
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            integer4 = 4;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            integer4 = 4;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            f4 = org.joda.time.Duration.standardMinutes(long3);
            x83 = new org.joda.time.LocalTime(integer4, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            k48 = new org.joda.time.MutablePeriod(long3, long3, g32);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            integer4 = 4;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            f4 = org.joda.time.Duration.standardMinutes(long3);
            x83 = new org.joda.time.LocalTime(integer4, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            k48 = new org.joda.time.MutablePeriod(long3, long3, g32);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            i68 = g96.getPeriodType();
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h87 = new org.joda.time.LocalDateTime(long1, g32);
            r38 = new org.joda.time.DateTime(integer2, integer2, integer3, integer4, integer3, integer4, integer3, g32);
            j2.hashCode();
        }

        /*
         *Testcase Number:247
        */        @Test
        public void TestJunit247() {
            org.joda.time.Period s37;
            boolean g70;
            boolean l32;
            org.joda.time.Seconds d8;
            org.joda.time.Weeks r40;
            org.joda.time.Hours f30;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int j57;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            f30 = r40.toStandardHours();
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            s37 = org.joda.time.Period.days(integer2);
            l32 = r40.isLessThan(r40);
            assertTrue(s37.equals(s37));
        }

        /*
         *Testcase Number:248
        */        @Test
        public void TestJunit248() {
            org.joda.time.Period y94;
            org.joda.time.Period r5;
            org.joda.time.Period i25;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.MutableInterval y75;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration f4;
            org.joda.time.Duration s32;
            org.joda.time.Duration t19;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            long long1;
            long long3;
            int integer3;
            int s21;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            f4 = org.joda.time.Duration.standardDays(long3);
            s32 = f4.multipliedBy(long3);
            t19 = org.joda.time.Duration.standardMinutes(long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            f4 = org.joda.time.Duration.standardDays(long3);
            s32 = f4.multipliedBy(long3);
            t19 = org.joda.time.Duration.standardMinutes(long3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            r5 = y94.withMinutes(integer3);
            s21 = r5.getMillis();
            i25 = y94.withHours(integer3);
            y94.toString();
        }

        /*
         *Testcase Number:249
        */        @Test
        public void TestJunit249() {
            org.joda.time.Period m38;
            org.joda.time.Period m70;
            org.joda.time.Period w95;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.YearMonth i66;
            long long1;
            long long3;
            long n63;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            m70 = m38.normalizedStandard();
            w95 = m38.minusHours(integer3);
            n63 = org.joda.time.DateTimeUtils.toJulianDayNumber(long1);
            assertTrue(m38.equals(m38));
        }

        /*
         *Testcase Number:250
        */        @Test
        public void TestJunit250() {
            org.joda.time.DateTimeComparator p47;
            org.joda.time.DateTimeComparator b73;
            org.joda.time.Partial p78;
            org.joda.time.Partial x13;
            org.joda.time.Period c6;
            org.joda.time.Chronology g32;
            org.joda.time.MonthDay b46;
            org.joda.time.DateTimeFieldType w20;
            int[] x81;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            b73 = org.joda.time.DateTimeComparator.getInstance(w20, w20);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            org.joda.time.DateTimeUtils.setCurrentMillisOffset(long3);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMinuteOfDay(integer5);
            b46 = new org.joda.time.MonthDay(long3);
            r7.set(w20, integer1);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            c6 = new org.joda.time.Period(long1, g32);
            x13 = p78.without(w20);
            p47.equals(p47);
        }

        /*
         *Testcase Number:251
        */        @Test
        public void TestJunit251() {
            org.joda.time.LocalDate h14;
            org.joda.time.DateTimeComparator p47;
            org.joda.time.DateTimeComparator b73;
            org.joda.time.DateTimeComparator z53;
            org.joda.time.Partial p78;
            org.joda.time.Partial a4;
            org.joda.time.Chronology g32;
            org.joda.time.DateTimeFieldType w20;
            int[] x81;
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            b73 = org.joda.time.DateTimeComparator.getInstance(w20, w20);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            a4 = p78.without(w20);
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            b73 = org.joda.time.DateTimeComparator.getInstance(w20, w20);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            a4 = p78.without(w20);
            z53 = org.joda.time.DateTimeComparator.getInstance(w20, w20);
            h14.hashCode();
        }

        /*
         *Testcase Number:252
        */        @Test
        public void TestJunit252() {
            org.joda.time.Period y37;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.YearMonth i66;
            org.joda.time.MonthDay i63;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMillisOfDay(integer3);
            y37 = org.joda.time.Period.hours(integer3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            r7.setMillisOfDay(integer3);
            i63 = new org.joda.time.MonthDay(long3);
            r7.setDayOfYear(integer3);
            y37.toString();
        }

        /*
         *Testcase Number:253
        */        @Test
        public void TestJunit253() {
            org.joda.time.LocalDate h14;
            org.joda.time.DateTimeComparator p47;
            org.joda.time.DateTimeComparator b73;
            org.joda.time.Partial p78;
            org.joda.time.Partial a4;
            org.joda.time.Chronology g32;
            org.joda.time.DateTimeFieldType w20;
            int[] x81;
            org.joda.time.MutableDateTime x54;
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            b73 = org.joda.time.DateTimeComparator.getInstance(w20, w20);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            a4 = p78.without(w20);
            x54 = new org.joda.time.MutableDateTime(g32);
            h14.hashCode();
        }

        /*
         *Testcase Number:254
        */        @Test
        public void TestJunit254() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.MutablePeriod l42;
            java.lang.String a43;
            org.joda.time.IllegalInstantException c84;
            org.joda.time.IllegalInstantException f91;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType c51;
            long long1;
            long long3;
            int integer3;
            int t39;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            f91 = new org.joda.time.IllegalInstantException(a43);
            c51 = p15.withSecondsRemoved();
            t39 = e6.getMillisOfSecond();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            f91 = new org.joda.time.IllegalInstantException(a43);
            c51 = p15.withSecondsRemoved();
            l42.setSeconds(integer3);
            assertTrue(z86.equals(z86));
        }

        /*
         *Testcase Number:255
        */        @Test
        public void TestJunit255() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration l13;
            org.joda.time.LocalTime e6;
            org.joda.time.MutablePeriod l42;
            java.lang.String a43;
            org.joda.time.IllegalInstantException c84;
            org.joda.time.IllegalInstantException f91;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType c51;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int h37;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            f91 = new org.joda.time.IllegalInstantException(a43);
            c51 = p15.withSecondsRemoved();
            h37 = e6.getMillisOfSecond();
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            r7.addWeekyears(integer3);
            z86.equals(z86);
        }

        /*
         *Testcase Number:256
        */        @Test
        public void TestJunit256() {
            org.joda.time.PeriodType w13;
            org.joda.time.PeriodType g39;
            w13 = org.joda.time.PeriodType.weeks();
            g39 = org.joda.time.DateTimeUtils.getPeriodType(w13);
            w13.hashCode();
        }

        /*
         *Testcase Number:257
        */        @Test
        public void TestJunit257() {
            org.joda.time.Period y94;
            org.joda.time.Period g38;
            org.joda.time.Period z68;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.LocalTime s86;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            long long1;
            long long3;
            int integer3;
            int integer5;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            s86 = new org.joda.time.LocalTime(long3);
            integer5 = 2;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            g38 = y94.withDays(integer5);
            z68 = g38.plusHours(integer3);
            y94.equals(y94);
        }

        /*
         *Testcase Number:258
        */        @Test
        public void TestJunit258() {
            org.joda.time.Partial p78;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration l13;
            org.joda.time.LocalTime e6;
            org.joda.time.Chronology g32;
            int[] x81;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.LocalDateTime h87;
            org.joda.time.LocalDateTime g1;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType i68;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            org.joda.time.Years g96;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            java.lang.String a43;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            i68 = g96.getPeriodType();
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h87 = new org.joda.time.LocalDateTime(long1, g32);
            g1 = h87.withDayOfYear(integer3);
            assertTrue(p78.equals(p78));
        }

        /*
         *Testcase Number:259
        */        @Test
        public void TestJunit259() {
            org.joda.time.Period v53;
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            v53 = org.joda.time.Period.months(integer4);
            assertTrue(v53.equals(v53));
        }

        /*
         *Testcase Number:260
        */        @Test
        public void TestJunit260() {
            org.joda.time.Partial p78;
            org.joda.time.Partial a4;
            org.joda.time.Period y42;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.Chronology g32;
            int[] x81;
            org.joda.time.MutablePeriod l42;
            org.joda.time.IllegalInstantException c84;
            org.joda.time.IllegalInstantException f91;
            org.joda.time.PeriodType p15;
            long long1;
            long long3;
            int integer3;
            int c30;
            org.joda.time.LocalDate h14;
            org.joda.time.DateTimeComparator p47;
            org.joda.time.DateTimeComparator b73;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.DateTimeFieldType w20;
            java.lang.String a43;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            f91 = new org.joda.time.IllegalInstantException(a43);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            c30 = e6.getMillisOfDay();
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            b73 = org.joda.time.DateTimeComparator.getInstance(w20, w20);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            a4 = p78.without(w20);
            y42 = new org.joda.time.Period(long3, long3, g32);
            assertTrue(p78.equals(p78));
        }

        /*
         *Testcase Number:261
        */        @Test
        public void TestJunit261() {
            org.joda.time.Period j2;
            org.joda.time.Period l57;
            org.joda.time.Period g8;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.MonthDay v57;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            integer4 = 4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            org.joda.time.DateTimeUtils.setCurrentMillisOffset(long3);
            v57 = new org.joda.time.MonthDay(integer4, integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            j2 = org.joda.time.Period.months(integer4);
            l57 = j2.withWeeks(integer4);
            g8 = l57.withSeconds(integer3);
            assertTrue(j2.equals(j2));
        }

        /*
         *Testcase Number:262
        */        @Test
        public void TestJunit262() {
            org.joda.time.Partial p78;
            org.joda.time.Period c6;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.Chronology g32;
            int[] x81;
            org.joda.time.MutablePeriod l42;
            org.joda.time.IllegalInstantException c84;
            org.joda.time.IllegalInstantException f91;
            org.joda.time.PeriodType p15;
            org.joda.time.MutableDateTime r7;
            org.joda.time.MutableDateTime l32;
            long long1;
            long long3;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            java.lang.String a43;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            f91 = new org.joda.time.IllegalInstantException(a43);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            c6 = new org.joda.time.Period(long1, g32);
            l32 = new org.joda.time.MutableDateTime(long1, g32);
            p78.hashCode();
        }

        /*
         *Testcase Number:263
        */        @Test
        public void TestJunit263() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Instant l49;
            org.joda.time.Duration l13;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.MutableInterval y41;
            org.joda.time.LocalTime e6;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth a14;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.DateTimeFieldType[] g81;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType o55;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int integer3;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            o55 = p15.withDaysRemoved();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            g81 = a14.getFieldTypes();
            l49 = f20.minus(long3);
            z86.toString();
        }

        /*
         *Testcase Number:264
        */        @Test
        public void TestJunit264() {
            org.joda.time.MutableInterval c53;
            c53 = new org.joda.time.MutableInterval();
            c53.hashCode();
        }

        /*
         *Testcase Number:265
        */        @Test
        public void TestJunit265() {
            org.joda.time.MutablePeriod a43;
            a43 = new org.joda.time.MutablePeriod();
            a43.clear();
            a43.toString();
        }

        /*
         *Testcase Number:266
        */        @Test
        public void TestJunit266() {
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration l13;
            org.joda.time.DateTime e69;
            org.joda.time.MutablePeriod g78;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.IllegalInstantException c69;
            org.joda.time.PeriodType w78;
            org.joda.time.PeriodType p15;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            long long2;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            y41.setDurationBeforeEnd(long2);
            g78.add(long3);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            c69 = new org.joda.time.IllegalInstantException(long3, a43);
            y41.equals(y41);
        }

        /*
         *Testcase Number:267
        */        @Test
        public void TestJunit267() {
            org.joda.time.Partial p78;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration l13;
            org.joda.time.LocalTime e6;
            org.joda.time.Chronology g32;
            int[] x81;
            org.joda.time.MutablePeriod l42;
            org.joda.time.IllegalInstantException c84;
            org.joda.time.IllegalInstantException f91;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.LocalDateTime h87;
            org.joda.time.LocalDateTime s76;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType c51;
            org.joda.time.PeriodType i68;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int t39;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            org.joda.time.Years g96;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            java.lang.String a43;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            f91 = new org.joda.time.IllegalInstantException(a43);
            c51 = p15.withSecondsRemoved();
            t39 = e6.getMillisOfSecond();
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            i68 = g96.getPeriodType();
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h87 = new org.joda.time.LocalDateTime(long1, g32);
            s76 = h87.withWeekyear(t39);
            p78.hashCode();
        }

        /*
         *Testcase Number:268
        */        @Test
        public void TestJunit268() {
            org.joda.time.Instant b14;
            b14 = new org.joda.time.Instant();
            b14.equals(b14);
        }

        /*
         *Testcase Number:269
        */        @Test
        public void TestJunit269() {
            org.joda.time.PeriodType b94;
            b94 = org.joda.time.PeriodType.days();
            b94.equals(b94);
        }

        /*
         *Testcase Number:270
        */        @Test
        public void TestJunit270() {
            org.joda.time.Partial p78;
            org.joda.time.Duration l13;
            org.joda.time.Chronology g32;
            org.joda.time.MonthDay v57;
            int[] x81;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.LocalDateTime h87;
            org.joda.time.LocalDateTime o49;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType i68;
            org.joda.time.MutableDateTime r7;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            int integer3;
            long long3;
            long long1;
            org.joda.time.Years g96;
            java.lang.String a43;
            integer4 = 4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            org.joda.time.DateTimeUtils.setCurrentMillisOffset(long3);
            v57 = new org.joda.time.MonthDay(integer4, integer5);
            integer2 = 10;
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            i68 = g96.getPeriodType();
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h87 = new org.joda.time.LocalDateTime(long1, g32);
            o49 = h87.withDate(integer1, integer2, integer1);
            p78.toString();
        }

        /*
         *Testcase Number:271
        */        @Test
        public void TestJunit271() {
            org.joda.time.Partial p78;
            org.joda.time.Years g96;
            org.joda.time.Years c38;
            org.joda.time.Duration l13;
            org.joda.time.Chronology g32;
            int[] x81;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.LocalDateTime h87;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType i68;
            org.joda.time.MutableDateTime r7;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            long long3;
            long long1;
            integer4 = 4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            i68 = g96.getPeriodType();
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h87 = new org.joda.time.LocalDateTime(long1, g32);
            c38 = g96.plus(integer4);
            p78.toString();
        }

        /*
         *Testcase Number:272
        */        @Test
        public void TestJunit272() {
            org.joda.time.LocalDateTime s24;
            s24 = new org.joda.time.LocalDateTime();
            assertTrue(s24.equals(s24));
        }

        /*
         *Testcase Number:273
        */        @Test
        public void TestJunit273() {
            org.joda.time.Partial p78;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration f4;
            org.joda.time.Chronology g32;
            org.joda.time.YearMonth x86;
            org.joda.time.LocalTime x83;
            org.joda.time.DateTime v55;
            int[] x81;
            org.joda.time.MutablePeriod k48;
            long long3;
            long long1;
            int integer4;
            int integer3;
            org.joda.time.LocalDate h14;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            integer4 = 4;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            f4 = org.joda.time.Duration.standardMinutes(long3);
            x83 = new org.joda.time.LocalTime(integer4, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            k48 = new org.joda.time.MutablePeriod(long3, long3, g32);
            v55 = h14.toDateTimeAtCurrentTime();
            p78.equals(p78);
        }

        /*
         *Testcase Number:274
        */        @Test
        public void TestJunit274() {
            org.joda.time.Partial p78;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.Chronology g32;
            org.joda.time.YearMonth x86;
            org.joda.time.DateTime r62;
            int[] x81;
            org.joda.time.MutablePeriod l42;
            org.joda.time.IllegalInstantException c84;
            org.joda.time.PeriodType p15;
            long long1;
            long long3;
            int integer3;
            org.joda.time.LocalDate h14;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            java.lang.String a43;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            r62 = h14.toDateTime(e6);
            p78.hashCode();
        }

        /*
         *Testcase Number:275
        */        @Test
        public void TestJunit275() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Instant a47;
            org.joda.time.Duration l13;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration f4;
            org.joda.time.MutableInterval y41;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType o55;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int integer3;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            o55 = p15.withDaysRemoved();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            f4 = org.joda.time.Duration.standardMinutes(long3);
            a47 = f20.withMillis(long1);
            assertTrue(z86.equals(z86));
        }

        /*
         *Testcase Number:276
        */        @Test
        public void TestJunit276() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            java.lang.Object d96;
            org.joda.time.MutablePeriod l42;
            org.joda.time.MutablePeriod k96;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            d96 = l42.clone();
            k96 = l42.copy();
            z86.toString();
        }

        /*
         *Testcase Number:277
        */        @Test
        public void TestJunit277() {
            org.joda.time.Period m38;
            org.joda.time.Period p19;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.LocalTime e6;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration d58;
            long long3;
            long long1;
            int c30;
            int integer3;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            c30 = e6.getMillisOfDay();
            long3 = 10;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            d58 = b98.multipliedBy(long3);
            p19 = m38.withMonths(c30);
            m38.toString();
        }

        /*
         *Testcase Number:278
        */        @Test
        public void TestJunit278() {
            org.joda.time.Partial p78;
            org.joda.time.Period z6;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.Chronology g32;
            int[] x81;
            org.joda.time.MutablePeriod l42;
            org.joda.time.PeriodType d44;
            long long1;
            long long3;
            int integer3;
            org.joda.time.LocalDate h14;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            java.lang.Object d96;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            d96 = l42.clone();
            d44 = org.joda.time.PeriodType.dayTime();
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            z6 = new org.joda.time.Period(d96, d44, g32);
            p78.equals(p78);
        }

        /*
         *Testcase Number:279
        */        @Test
        public void TestJunit279() {
            org.joda.time.Partial p78;
            org.joda.time.Partial a4;
            org.joda.time.Partial g21;
            org.joda.time.Chronology g32;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            int[] x81;
            org.joda.time.MutablePeriod l42;
            org.joda.time.MutablePeriod k96;
            long long1;
            long long3;
            int integer3;
            org.joda.time.LocalDate h14;
            org.joda.time.DateTimeComparator p47;
            org.joda.time.DateTimeComparator b73;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.DateTimeFieldType w20;
            java.lang.Object d96;
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            b73 = org.joda.time.DateTimeComparator.getInstance(w20, w20);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            a4 = p78.without(w20);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            d96 = l42.clone();
            k96 = l42.copy();
            g21 = new org.joda.time.Partial(w20, integer3);
            assertTrue(p78.equals(p78));
        }

        /*
         *Testcase Number:280
        */        @Test
        public void TestJunit280() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration s66;
            org.joda.time.YearMonth i66;
            org.joda.time.DateTime e69;
            org.joda.time.MonthDay d81;
            org.joda.time.MutablePeriod x96;
            org.joda.time.PeriodType h34;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            long long2;
            int integer3;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMonthOfYear(integer3);
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            d81 = new org.joda.time.MonthDay(long2);
            h34 = org.joda.time.PeriodType.millis();
            x96 = new org.joda.time.MutablePeriod(long3, long2, h34);
            s66 = y79.toDuration();
            assertTrue(z86.equals(z86));
        }

        /*
         *Testcase Number:281
        */        @Test
        public void TestJunit281() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.YearMonth i66;
            org.joda.time.DateTime w55;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            w55 = new org.joda.time.DateTime(long3);
            z86.toString();
        }

        /*
         *Testcase Number:282
        */        @Test
        public void TestJunit282() {
            org.joda.time.Partial p78;
            org.joda.time.Duration l13;
            org.joda.time.Chronology g32;
            int[] x81;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.LocalDateTime h87;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType i68;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            org.joda.time.LocalDate o36;
            org.joda.time.Years g96;
            java.lang.String a43;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            i68 = g96.getPeriodType();
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h87 = new org.joda.time.LocalDateTime(long1, g32);
            o36 = h87.toLocalDate();
            assertTrue(p78.equals(p78));
        }

        /*
         *Testcase Number:283
        */        @Test
        public void TestJunit283() {
            org.joda.time.Partial p78;
            org.joda.time.Years g96;
            org.joda.time.Duration l13;
            org.joda.time.Chronology g32;
            int[] x81;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.LocalDateTime h87;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType i68;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int u86;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            i68 = g96.getPeriodType();
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h87 = new org.joda.time.LocalDateTime(long1, g32);
            u86 = h87.getDayOfWeek();
            p78.toString();
        }

        /*
         *Testcase Number:284
        */        @Test
        public void TestJunit284() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration f4;
            org.joda.time.LocalTime x83;
            org.joda.time.MutableDateTime r7;
            int integer4;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            long long1;
            long long3;
            integer4 = 4;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            f4 = org.joda.time.Duration.standardMinutes(long3);
            x83 = new org.joda.time.LocalTime(integer4, integer3);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setWeekOfWeekyear(integer3);
            z86.equals(z86);
        }

        /*
         *Testcase Number:285
        */        @Test
        public void TestJunit285() {
            org.joda.time.Partial p78;
            org.joda.time.Duration l13;
            org.joda.time.Chronology g32;
            int[] x81;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.LocalDateTime h87;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType i68;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            org.joda.time.LocalDate r33;
            org.joda.time.Years g96;
            java.lang.String a43;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            i68 = g96.getPeriodType();
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h87 = new org.joda.time.LocalDateTime(long1, g32);
            r33 = h87.toLocalDate();
            p78.toString();
        }

        /*
         *Testcase Number:286
        */        @Test
        public void TestJunit286() {
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int v70;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            v70 = d8.getSeconds();
            d8.equals(d8);
        }

        /*
         *Testcase Number:287
        */        @Test
        public void TestJunit287() {
            org.joda.time.DateTime f91;
            org.joda.time.LocalDateTime s24;
            s24 = new org.joda.time.LocalDateTime();
            f91 = s24.toDateTime();
            f91.equals(f91);
        }

        /*
         *Testcase Number:288
        */        @Test
        public void TestJunit288() {
            org.joda.time.Instant y40;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Instant b82;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.LocalTime t83;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth a14;
            org.joda.time.DateTimeFieldType[] g81;
            org.joda.time.MutableDateTime r7;
            int integer3;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            long long3;
            long long1;
            integer3 = 6;
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setSecondOfDay(integer3);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            org.joda.time.DateTimeUtils.setCurrentMillisOffset(long3);
            r7.setMinuteOfHour(integer5);
            y40 = org.joda.time.Instant.ofEpochSecond(long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            g81 = a14.getFieldTypes();
            b82 = f20.toInstant();
            t83 = e6.withMillisOfDay(integer4);
            y40.hashCode();
        }

        /*
         *Testcase Number:289
        */        @Test
        public void TestJunit289() {
            org.joda.time.Period y94;
            org.joda.time.Period g38;
            org.joda.time.Period u94;
            org.joda.time.Period y37;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.YearMonth i66;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            org.joda.time.MutableDateTime r7;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long long3;
            long long1;
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            integer5 = 2;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            g38 = y94.withDays(integer5);
            u94 = g38.withYears(integer2);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMillisOfDay(integer3);
            y37 = org.joda.time.Period.hours(integer3);
            r7.setMillis(long3);
            y94.toString();
        }

        /*
         *Testcase Number:290
        */        @Test
        public void TestJunit290() {
            org.joda.time.Partial p78;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration f4;
            org.joda.time.LocalTime e6;
            org.joda.time.LocalTime x83;
            org.joda.time.Chronology g32;
            org.joda.time.YearMonth x86;
            int[] x81;
            org.joda.time.MutablePeriod l42;
            org.joda.time.MutablePeriod k48;
            org.joda.time.MutablePeriod m14;
            long long1;
            long long3;
            int integer3;
            int integer4;
            org.joda.time.LocalDate h14;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            java.lang.Object d96;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            d96 = l42.clone();
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            integer4 = 4;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            f4 = org.joda.time.Duration.standardMinutes(long3);
            x83 = new org.joda.time.LocalTime(integer4, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            k48 = new org.joda.time.MutablePeriod(long3, long3, g32);
            m14 = new org.joda.time.MutablePeriod(d96, g32);
            p78.equals(p78);
        }

        /*
         *Testcase Number:291
        */        @Test
        public void TestJunit291() {
            org.joda.time.Partial p78;
            org.joda.time.Duration l13;
            org.joda.time.Chronology g32;
            org.joda.time.DateTime j57;
            int[] x81;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.LocalDateTime h87;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType i68;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            org.joda.time.Years g96;
            java.lang.String a43;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            i68 = g96.getPeriodType();
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h87 = new org.joda.time.LocalDateTime(long1, g32);
            j57 = h87.toDateTime();
            p78.equals(p78);
        }

        /*
         *Testcase Number:292
        */        @Test
        public void TestJunit292() {
            org.joda.time.Period m38;
            org.joda.time.Period m70;
            org.joda.time.Period w42;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration m68;
            org.joda.time.LocalTime e6;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth a14;
            org.joda.time.DateTime f91;
            org.joda.time.MonthDay v57;
            org.joda.time.LocalDateTime s24;
            org.joda.time.LocalDateTime e18;
            org.joda.time.MutableDateTime r7;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            int integer3;
            long long3;
            long long1;
            long i68;
            integer4 = 4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            org.joda.time.DateTimeUtils.setCurrentMillisOffset(long3);
            v57 = new org.joda.time.MonthDay(integer4, integer5);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            m68 = org.joda.time.Duration.millis(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            m70 = m38.normalizedStandard();
            i68 = b98.getStandardHours();
            w42 = m38.toPeriod();
            s24 = new org.joda.time.LocalDateTime();
            f91 = s24.toDateTime();
            e18 = s24.withDate(integer4, integer3, integer3);
            assertTrue(m38.equals(m38));
        }

        /*
         *Testcase Number:293
        */        @Test
        public void TestJunit293() {
            org.joda.time.Period y94;
            org.joda.time.Period r5;
            org.joda.time.Period m38;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Instant e28;
            org.joda.time.MutableInterval y41;
            org.joda.time.MutableInterval y75;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration f4;
            org.joda.time.Duration s32;
            org.joda.time.Duration t19;
            org.joda.time.Duration d58;
            org.joda.time.LocalTime e6;
            java.lang.Object d96;
            org.joda.time.MutablePeriod l42;
            org.joda.time.MutablePeriod g78;
            org.joda.time.MutablePeriod c54;
            org.joda.time.PeriodType w78;
            org.joda.time.PeriodType y44;
            org.joda.time.PeriodType m3;
            long long1;
            long long3;
            int integer3;
            int c48;
            int s21;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            d96 = l42.clone();
            c48 = e6.getMillisOfSecond();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            f4 = org.joda.time.Duration.standardDays(long3);
            s32 = f4.multipliedBy(long3);
            t19 = org.joda.time.Duration.standardMinutes(long3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            r5 = y94.withMinutes(integer3);
            s21 = r5.getMillis();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            d58 = b98.multipliedBy(long3);
            e28 = z86.withMillis(long3);
            long3 = 10;
            y44 = org.joda.time.PeriodType.yearWeekDay();
            c54 = new org.joda.time.MutablePeriod(long3, long3, y44);
            m3 = y44.withMinutesRemoved();
            c54.setPeriod(long3, long3);
            assertTrue(y94.equals(y94));
        }

        /*
         *Testcase Number:294
        */        @Test
        public void TestJunit294() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            java.lang.Object d96;
            org.joda.time.MutablePeriod l42;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            d96 = l42.clone();
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setDate(long3);
            assertTrue(z86.equals(z86));
        }

        /*
         *Testcase Number:295
        */        @Test
        public void TestJunit295() {
            org.joda.time.Partial p78;
            org.joda.time.Partial a4;
            org.joda.time.Chronology g32;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            int[] x81;
            org.joda.time.MutablePeriod l42;
            org.joda.time.IllegalInstantException c84;
            org.joda.time.PeriodType p15;
            long long1;
            long long3;
            int integer3;
            org.joda.time.LocalDate h14;
            org.joda.time.DateTimeComparator p47;
            org.joda.time.DateTimeComparator b73;
            org.joda.time.DateTimeComparator z53;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.DateTimeFieldType w20;
            java.lang.String a43;
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            b73 = org.joda.time.DateTimeComparator.getInstance(w20, w20);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            a4 = p78.without(w20);
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            b73 = org.joda.time.DateTimeComparator.getInstance(w20, w20);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            a4 = p78.without(w20);
            z53 = org.joda.time.DateTimeComparator.getInstance(w20, w20);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            y41.setChronology(g32);
            assertTrue(p78.equals(p78));
        }

        /*
         *Testcase Number:296
        */        @Test
        public void TestJunit296() {
            org.joda.time.LocalTime i71;
            i71 = new org.joda.time.LocalTime();
            assertTrue(i71.equals(i71));
        }

        /*
         *Testcase Number:297
        */        @Test
        public void TestJunit297() {
            org.joda.time.Partial p78;
            org.joda.time.Period c31;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration l13;
            org.joda.time.LocalTime e6;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth a14;
            org.joda.time.Chronology g32;
            int[] x81;
            org.joda.time.DateTimeFieldType[] g81;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.LocalDateTime h87;
            org.joda.time.PeriodType g60;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType i68;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            org.joda.time.Years g96;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            java.lang.String a43;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            g81 = a14.getFieldTypes();
            g60 = org.joda.time.PeriodType.time();
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            i68 = g96.getPeriodType();
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h87 = new org.joda.time.LocalDateTime(long1, g32);
            c31 = new org.joda.time.Period(long1, g60, g32);
            p78.hashCode();
        }

        /*
         *Testcase Number:298
        */        @Test
        public void TestJunit298() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.MutablePeriod l42;
            java.lang.String a43;
            org.joda.time.IllegalInstantException c84;
            org.joda.time.IllegalInstantException f91;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType c51;
            org.joda.time.MutableDateTime z18;
            long long1;
            long long3;
            int integer3;
            int t39;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            f91 = new org.joda.time.IllegalInstantException(a43);
            c51 = p15.withSecondsRemoved();
            t39 = e6.getMillisOfSecond();
            z18 = new org.joda.time.MutableDateTime(long3);
            assertTrue(z86.equals(z86));
        }

        /*
         *Testcase Number:299
        */        @Test
        public void TestJunit299() {
            org.joda.time.LocalDate a33;
            org.joda.time.DateTime q59;
            org.joda.time.DateTime i12;
            org.joda.time.DateTime w86;
            org.joda.time.DateTime e69;
            org.joda.time.DateTime y89;
            org.joda.time.MonthDay d81;
            long long2;
            a33 = new org.joda.time.LocalDate();
            q59 = a33.toDateTimeAtCurrentTime();
            i12 = q59.withEarlierOffsetAtOverlap();
            w86 = a33.toDateTimeAtCurrentTime();
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            d81 = new org.joda.time.MonthDay(long2);
            org.joda.time.DateTimeUtils.setCurrentMillisFixed(long2);
            y89 = e69.withDate(a33);
            a33.equals(a33);
        }

        /*
         *Testcase Number:300
        */        @Test
        public void TestJunit300() {
            org.joda.time.Partial p78;
            org.joda.time.Years g96;
            org.joda.time.Duration l13;
            org.joda.time.Chronology g32;
            int[] x81;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.LocalDateTime h87;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType i68;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int h17;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            i68 = g96.getPeriodType();
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h87 = new org.joda.time.LocalDateTime(long1, g32);
            h17 = h87.getDayOfYear();
            p78.toString();
        }

        /*
         *Testcase Number:301
        */        @Test
        public void TestJunit301() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.YearMonth i66;
            org.joda.time.DateTime w55;
            org.joda.time.LocalDateTime s24;
            org.joda.time.LocalDateTime i43;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            w55 = new org.joda.time.DateTime(long3);
            s24 = new org.joda.time.LocalDateTime();
            i43 = s24.withYearOfEra(integer3);
            assertTrue(z86.equals(z86));
        }

        /*
         *Testcase Number:302
        */        @Test
        public void TestJunit302() {
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.LocalTime h68;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            long long3;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            h68 = new org.joda.time.LocalTime(long3);
            org.joda.time.DateTimeUtils.setCurrentMillisOffset(long3);
            y41.equals(y41);
        }

        /*
         *Testcase Number:303
        */        @Test
        public void TestJunit303() {
            org.joda.time.Instant g30;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.LocalTime h68;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            long long3;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            h68 = new org.joda.time.LocalTime(long3);
            g30 = org.joda.time.Instant.ofEpochSecond(long3);
            assertTrue(g30.equals(g30));
        }

        /*
         *Testcase Number:304
        */        @Test
        public void TestJunit304() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.MutablePeriod l42;
            java.lang.String a43;
            org.joda.time.IllegalInstantException c84;
            org.joda.time.LocalDateTime d3;
            org.joda.time.PeriodType p15;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            d3 = new org.joda.time.LocalDateTime(long3);
            z86.equals(z86);
        }

        /*
         *Testcase Number:305
        */        @Test
        public void TestJunit305() {
            org.joda.time.Period y94;
            org.joda.time.Period g38;
            org.joda.time.Partial p78;
            org.joda.time.LocalTime e6;
            org.joda.time.Duration y79;
            org.joda.time.Chronology g32;
            org.joda.time.YearMonth x86;
            int[] x81;
            org.joda.time.MutablePeriod g78;
            org.joda.time.MutablePeriod k11;
            org.joda.time.PeriodType w78;
            long long3;
            int c30;
            int integer5;
            org.joda.time.LocalDate h14;
            org.joda.time.MutableInterval y41;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            c30 = e6.getMillisOfDay();
            org.joda.time.DateTimeUtils.setCurrentMillisOffset(long3);
            integer5 = 2;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            g38 = y94.withDays(integer5);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            k11 = new org.joda.time.MutablePeriod(long3, w78, g32);
            y94.hashCode();
        }

        /*
         *Testcase Number:306
        */        @Test
        public void TestJunit306() {
            org.joda.time.LocalDate h14;
            org.joda.time.Partial p78;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration f4;
            org.joda.time.Chronology g32;
            org.joda.time.YearMonth x86;
            org.joda.time.LocalTime x83;
            int[] x81;
            org.joda.time.MutablePeriod k48;
            long long3;
            long long1;
            int integer4;
            int integer3;
            int y6;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            integer4 = 4;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            f4 = org.joda.time.Duration.standardMinutes(long3);
            x83 = new org.joda.time.LocalTime(integer4, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            k48 = new org.joda.time.MutablePeriod(long3, long3, g32);
            y6 = x83.getMillisOfDay();
            assertTrue(h14.equals(h14));
        }

        /*
         *Testcase Number:307
        */        @Test
        public void TestJunit307() {
            org.joda.time.Period m38;
            org.joda.time.Period m70;
            org.joda.time.Period w95;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth a14;
            org.joda.time.YearMonth i96;
            org.joda.time.DateTimeFieldType[] g81;
            long long1;
            long long3;
            long n63;
            int integer3;
            int r11;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            g81 = a14.getFieldTypes();
            r11 = e6.getMinuteOfHour();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            m70 = m38.normalizedStandard();
            w95 = m38.minusHours(integer3);
            n63 = org.joda.time.DateTimeUtils.toJulianDayNumber(long1);
            i96 = i66.minusMonths(integer3);
            m38.equals(m38);
        }

        /*
         *Testcase Number:308
        */        @Test
        public void TestJunit308() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            java.lang.Object d96;
            org.joda.time.MutablePeriod l42;
            org.joda.time.MutableDateTime r7;
            int integer3;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            int c48;
            long long3;
            long long1;
            integer3 = 6;
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setSecondOfDay(integer3);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            org.joda.time.DateTimeUtils.setCurrentMillisOffset(long3);
            r7.setMinuteOfHour(integer5);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            d96 = l42.clone();
            c48 = e6.getMillisOfSecond();
            l42.setHours(integer5);
            z86.toString();
        }

        /*
         *Testcase Number:309
        */        @Test
        public void TestJunit309() {
            org.joda.time.Period b24;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            b24 = new org.joda.time.Period(long3);
            b24.equals(b24);
        }

        /*
         *Testcase Number:310
        */        @Test
        public void TestJunit310() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            java.lang.Object d96;
            org.joda.time.MutablePeriod l42;
            long long1;
            long long3;
            int integer3;
            int c48;
            int k4;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            d96 = l42.clone();
            c48 = e6.getMillisOfSecond();
            k4 = e6.getSecondOfMinute();
            z86.equals(z86);
        }

        /*
         *Testcase Number:311
        */        @Test
        public void TestJunit311() {
            org.joda.time.Instant q53;
            org.joda.time.MutableDateTime v93;
            long long1;
            long1 = 7;
            q53 = org.joda.time.Instant.ofEpochSecond(long1);
            v93 = q53.toMutableDateTime();
            q53.hashCode();
        }

        /*
         *Testcase Number:312
        */        @Test
        public void TestJunit312() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.DateTime e69;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration v85;
            org.joda.time.Duration b98;
            org.joda.time.Duration b27;
            org.joda.time.LocalTime e6;
            org.joda.time.MutablePeriod g78;
            org.joda.time.MutablePeriod l42;
            java.lang.String a43;
            org.joda.time.IllegalInstantException c84;
            org.joda.time.IllegalInstantException f91;
            org.joda.time.PeriodType w78;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType c51;
            org.joda.time.MutableDateTime z18;
            long long2;
            long long3;
            long long1;
            int integer3;
            int t39;
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            y41.setDurationBeforeEnd(long2);
            v85 = org.joda.time.Duration.millis(long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            f91 = new org.joda.time.IllegalInstantException(a43);
            c51 = p15.withSecondsRemoved();
            t39 = e6.getMillisOfSecond();
            z18 = new org.joda.time.MutableDateTime(long3);
            b27 = y79.dividedBy(long2);
            assertTrue(z86.equals(z86));
        }

        /*
         *Testcase Number:313
        */        @Test
        public void TestJunit313() {
            org.joda.time.Period y94;
            org.joda.time.Period g38;
            org.joda.time.Period u94;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.MonthDay i63;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            r7.setMillisOfDay(integer3);
            i63 = new org.joda.time.MonthDay(long3);
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            integer5 = 2;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            g38 = y94.withDays(integer5);
            u94 = g38.withYears(integer2);
            r7.setMonthOfYear(integer1);
            y94.hashCode();
        }

        /*
         *Testcase Number:314
        */        @Test
        public void TestJunit314() {
            org.joda.time.Period m38;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Instant e28;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration d58;
            org.joda.time.MutablePeriod c54;
            org.joda.time.PeriodType y44;
            org.joda.time.PeriodType m3;
            long long1;
            long long3;
            int integer3;
            int e25;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            d58 = b98.multipliedBy(long3);
            e28 = z86.withMillis(long3);
            long3 = 10;
            y44 = org.joda.time.PeriodType.yearWeekDay();
            c54 = new org.joda.time.MutablePeriod(long3, long3, y44);
            m3 = y44.withMinutesRemoved();
            e25 = m38.getMillis();
            m38.equals(m38);
        }

        /*
         *Testcase Number:315
        */        @Test
        public void TestJunit315() {
            org.joda.time.Instant q53;
            org.joda.time.Instant x94;
            long long1;
            long1 = 7;
            q53 = org.joda.time.Instant.ofEpochSecond(long1);
            x94 = org.joda.time.Instant.ofEpochMilli(long1);
            q53.equals(q53);
        }

        /*
         *Testcase Number:316
        */        @Test
        public void TestJunit316() {
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.Seconds z17;
            org.joda.time.Weeks r40;
            org.joda.time.Hours w14;
            org.joda.time.Days m20;
            org.joda.time.Days k92;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int j57;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            z17 = r40.toStandardSeconds();
            w14 = r40.toStandardHours();
            m20 = r40.toStandardDays();
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            z17 = r40.toStandardSeconds();
            w14 = r40.toStandardHours();
            m20 = r40.toStandardDays();
            k92 = m20.plus(m20);
            d8.equals(d8);
        }

        /*
         *Testcase Number:317
        */        @Test
        public void TestJunit317() {
            org.joda.time.Years g96;
            org.joda.time.Duration l13;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType p15;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            long l24;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int y42;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            l24 = l13.getStandardSeconds();
            y42 = g96.getYears();
            g96.hashCode();
        }

        /*
         *Testcase Number:318
        */        @Test
        public void TestJunit318() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.DateTime e69;
            org.joda.time.DateTime n43;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.YearMonth i66;
            org.joda.time.MonthDay d81;
            org.joda.time.MutableDateTime r7;
            long long2;
            long long1;
            long long3;
            int integer3;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            d81 = new org.joda.time.MonthDay(long2);
            org.joda.time.DateTimeUtils.setCurrentMillisFixed(long2);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMonthOfYear(integer3);
            r7.setMillis(long2);
            n43 = e69.toDateTimeISO();
            z86.equals(z86);
        }

        /*
         *Testcase Number:319
        */        @Test
        public void TestJunit319() {
            org.joda.time.Period m38;
            org.joda.time.Period m70;
            org.joda.time.Period w95;
            org.joda.time.Period s74;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration d58;
            org.joda.time.YearMonth i66;
            long long1;
            long long3;
            long n63;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            m70 = m38.normalizedStandard();
            w95 = m38.minusHours(integer3);
            n63 = org.joda.time.DateTimeUtils.toJulianDayNumber(long1);
            long3 = 10;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            d58 = b98.multipliedBy(long3);
            s74 = m38.minusHours(integer3);
            m38.hashCode();
        }

        /*
         *Testcase Number:320
        */        @Test
        public void TestJunit320() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Instant b82;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration z77;
            org.joda.time.LocalTime e6;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth a14;
            org.joda.time.DateTimeFieldType[] g81;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            g81 = a14.getFieldTypes();
            b82 = f20.toInstant();
            z77 = org.joda.time.Duration.millis(long3);
            z86.toString();
        }

        /*
         *Testcase Number:321
        */        @Test
        public void TestJunit321() {
            org.joda.time.PeriodType a92;
            a92 = org.joda.time.PeriodType.years();
            assertTrue(a92.equals(a92));
        }

        /*
         *Testcase Number:322
        */        @Test
        public void TestJunit322() {
            org.joda.time.PeriodType a92;
            org.joda.time.PeriodType q92;
            a92 = org.joda.time.PeriodType.years();
            q92 = a92.withMinutesRemoved();
            a92.toString();
        }

        /*
         *Testcase Number:323
        */        @Test
        public void TestJunit323() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            java.lang.Object n18;
            org.joda.time.MutablePeriod l42;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            n18 = l42.clone();
            z86.hashCode();
        }

        /*
         *Testcase Number:324
        */        @Test
        public void TestJunit324() {
            org.joda.time.Partial p78;
            org.joda.time.Years g96;
            org.joda.time.Duration l13;
            org.joda.time.Chronology g32;
            int[] x81;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.IllegalInstantException r94;
            org.joda.time.LocalDateTime h87;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType i68;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            i68 = g96.getPeriodType();
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h87 = new org.joda.time.LocalDateTime(long1, g32);
            r94 = new org.joda.time.IllegalInstantException(a43);
            p78.toString();
        }

        /*
         *Testcase Number:325
        */        @Test
        public void TestJunit325() {
            org.joda.time.Duration l13;
            org.joda.time.Duration s25;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            s25 = l13.toDuration();
            l13.toString();
        }

        /*
         *Testcase Number:326
        */        @Test
        public void TestJunit326() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth a14;
            org.joda.time.DateTime e69;
            org.joda.time.MonthDay d81;
            org.joda.time.MutablePeriod x96;
            org.joda.time.PeriodType h34;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            long long2;
            int integer3;
            int g59;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            g59 = e6.getSecondOfMinute();
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            d81 = new org.joda.time.MonthDay(long2);
            org.joda.time.DateTimeUtils.setCurrentMillisFixed(long2);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMonthOfYear(integer3);
            r7.setMillis(long2);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMonthOfYear(integer3);
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            d81 = new org.joda.time.MonthDay(long2);
            h34 = org.joda.time.PeriodType.millis();
            x96 = new org.joda.time.MutablePeriod(long3, long2, h34);
            x96.setPeriod(long3, long1);
            z86.equals(z86);
        }

        /*
         *Testcase Number:327
        */        @Test
        public void TestJunit327() {
            org.joda.time.LocalDate h14;
            org.joda.time.Partial p78;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Chronology g32;
            org.joda.time.YearMonth x86;
            org.joda.time.DateTime b28;
            int[] x81;
            long long3;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            b28 = h14.toDateTimeAtCurrentTime();
            h14.equals(h14);
        }

        /*
         *Testcase Number:328
        */        @Test
        public void TestJunit328() {
            org.joda.time.PeriodType c19;
            org.joda.time.PeriodType q16;
            c19 = org.joda.time.PeriodType.yearMonthDayTime();
            q16 = c19.withMillisRemoved();
            assertTrue(c19.equals(c19));
        }

        /*
         *Testcase Number:329
        */        @Test
        public void TestJunit329() {
            org.joda.time.Instant g30;
            org.joda.time.Instant c6;
            org.joda.time.MutableInterval y75;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration f4;
            org.joda.time.Duration y79;
            org.joda.time.LocalTime h68;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            long long1;
            long long3;
            long l25;
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            f4 = org.joda.time.Duration.standardDays(long3);
            l25 = f4.getStandardSeconds();
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            h68 = new org.joda.time.LocalTime(long3);
            g30 = org.joda.time.Instant.ofEpochSecond(long3);
            c6 = g30.withMillis(long1);
            assertTrue(g30.equals(g30));
        }

        /*
         *Testcase Number:330
        */        @Test
        public void TestJunit330() {
            org.joda.time.Partial p78;
            org.joda.time.Period z6;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.Chronology g32;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth d94;
            int[] x81;
            org.joda.time.MutablePeriod l42;
            org.joda.time.PeriodType d44;
            long long1;
            long long3;
            int integer3;
            org.joda.time.LocalDate h14;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            java.lang.Object d96;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            d96 = l42.clone();
            d44 = org.joda.time.PeriodType.dayTime();
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            z6 = new org.joda.time.Period(d96, d44, g32);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            d94 = i66.withChronologyRetainFields(g32);
            assertTrue(p78.equals(p78));
        }

        /*
         *Testcase Number:331
        */        @Test
        public void TestJunit331() {
            org.joda.time.Partial p78;
            org.joda.time.Period z6;
            org.joda.time.DateTime e69;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.Chronology g32;
            org.joda.time.MonthDay d81;
            org.joda.time.MonthDay d67;
            int[] x81;
            org.joda.time.MutablePeriod l42;
            org.joda.time.LocalDateTime v44;
            org.joda.time.PeriodType d44;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            long long2;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int integer3;
            org.joda.time.LocalDate h14;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            java.lang.Object d96;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            d81 = new org.joda.time.MonthDay(long2);
            d67 = d81.withDayOfMonth(integer5);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            d96 = l42.clone();
            d44 = org.joda.time.PeriodType.dayTime();
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            z6 = new org.joda.time.Period(d96, d44, g32);
            v44 = new org.joda.time.LocalDateTime(long3, g32);
            p78.equals(p78);
        }

        /*
         *Testcase Number:332
        */        @Test
        public void TestJunit332() {
            org.joda.time.Years g96;
            org.joda.time.Years a87;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration l13;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType p15;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            a87 = g96.minus(integer3);
            g96.equals(g96);
        }

        /*
         *Testcase Number:333
        */        @Test
        public void TestJunit333() {
            org.joda.time.Partial p78;
            org.joda.time.Period x75;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.Chronology g32;
            int[] x81;
            org.joda.time.MutablePeriod l42;
            org.joda.time.MutablePeriod k96;
            long long1;
            long long3;
            int integer3;
            org.joda.time.LocalDate h14;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            java.lang.Object d96;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            d96 = l42.clone();
            k96 = l42.copy();
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x75 = new org.joda.time.Period(d96, g32);
            assertTrue(p78.equals(p78));
        }

        /*
         *Testcase Number:334
        */        @Test
        public void TestJunit334() {
            org.joda.time.Period m38;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Instant e28;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration d58;
            org.joda.time.MutablePeriod c54;
            org.joda.time.PeriodType y44;
            org.joda.time.PeriodType m3;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int e25;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            d58 = b98.multipliedBy(long3);
            e28 = z86.withMillis(long3);
            long3 = 10;
            y44 = org.joda.time.PeriodType.yearWeekDay();
            c54 = new org.joda.time.MutablePeriod(long3, long3, y44);
            m3 = y44.withMinutesRemoved();
            e25 = m38.getMillis();
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setWeekOfWeekyear(integer3);
            m38.hashCode();
        }

        /*
         *Testcase Number:335
        */        @Test
        public void TestJunit335() {
            org.joda.time.MutableInterval y41;
            org.joda.time.LocalTime e6;
            org.joda.time.MonthDay v57;
            org.joda.time.MonthDay x96;
            org.joda.time.MutableDateTime r7;
            long long3;
            int c30;
            int integer2;
            int integer4;
            int integer5;
            int integer1;
            int integer3;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            c30 = e6.getMillisOfDay();
            integer2 = 10;
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            r7.setDate(c30, integer2, integer5);
            integer4 = 4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            org.joda.time.DateTimeUtils.setCurrentMillisOffset(long3);
            v57 = new org.joda.time.MonthDay(integer4, integer5);
            x96 = v57.withDayOfMonth(integer2);
            assertTrue(y41.equals(y41));
        }

        /*
         *Testcase Number:336
        */        @Test
        public void TestJunit336() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Instant x8;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            java.lang.Object d96;
            org.joda.time.MutablePeriod l42;
            org.joda.time.MutablePeriod k96;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int integer3;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            d96 = l42.clone();
            k96 = l42.copy();
            x8 = z86.plus(long3);
            z86.equals(z86);
        }

        /*
         *Testcase Number:337
        */        @Test
        public void TestJunit337() {
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.MutablePeriod l42;
            org.joda.time.IllegalInstantException c84;
            org.joda.time.IllegalInstantException f91;
            org.joda.time.IllegalFieldValueException e52;
            org.joda.time.PeriodType p15;
            long long1;
            long long3;
            int integer3;
            org.joda.time.DateTimeComparator p47;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.DateTimeFieldType w20;
            java.lang.String a43;
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            f91 = new org.joda.time.IllegalInstantException(a43);
            e52 = new org.joda.time.IllegalFieldValueException(w20, a43);
            assertTrue(y79.equals(y79));
        }

        /*
         *Testcase Number:338
        */        @Test
        public void TestJunit338() {
            org.joda.time.Period y94;
            org.joda.time.Period g38;
            org.joda.time.Period u94;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            java.lang.Object w56;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            org.joda.time.MutableDateTime r7;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long long3;
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            integer5 = 2;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            g38 = y94.withDays(integer5);
            u94 = g38.withYears(integer2);
            w56 = g78.clone();
            y94.equals(y94);
        }

        /*
         *Testcase Number:339
        */        @Test
        public void TestJunit339() {
            org.joda.time.Period m38;
            org.joda.time.Period m70;
            org.joda.time.Period j2;
            org.joda.time.Period l77;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            m70 = m38.normalizedStandard();
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            j2 = org.joda.time.Period.months(integer4);
            l77 = j2.withSeconds(integer3);
            m38.hashCode();
        }

        /*
         *Testcase Number:340
        */        @Test
        public void TestJunit340() {
            org.joda.time.Period s37;
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.Weeks r40;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int j57;
            int p65;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            s37 = org.joda.time.Period.days(integer2);
            p65 = s37.getHours();
            s37.hashCode();
        }

        /*
         *Testcase Number:341
        */        @Test
        public void TestJunit341() {
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.Seconds z17;
            org.joda.time.Weeks r40;
            org.joda.time.Hours w14;
            org.joda.time.Hours f30;
            org.joda.time.Hours b93;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int j57;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            z17 = r40.toStandardSeconds();
            w14 = r40.toStandardHours();
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            f30 = r40.toStandardHours();
            b93 = f30.plus(w14);
            d8.equals(d8);
        }

        /*
         *Testcase Number:342
        */        @Test
        public void TestJunit342() {
            org.joda.time.Period y94;
            org.joda.time.Period g38;
            org.joda.time.Period u94;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration j85;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            org.joda.time.MutableDateTime r7;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long long3;
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            integer5 = 2;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            g38 = y94.withDays(integer5);
            u94 = g38.withYears(integer2);
            j85 = org.joda.time.Duration.standardHours(long3);
            assertTrue(y94.equals(y94));
        }

        /*
         *Testcase Number:343
        */        @Test
        public void TestJunit343() {
            org.joda.time.Partial p78;
            org.joda.time.Duration l13;
            org.joda.time.Chronology g32;
            int[] x81;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.LocalDateTime h87;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType i68;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            boolean j7;
            org.joda.time.Years g96;
            java.lang.String a43;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            i68 = g96.getPeriodType();
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h87 = new org.joda.time.LocalDateTime(long1, g32);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            j7 = g96.isLessThan(g96);
            p78.hashCode();
        }

        /*
         *Testcase Number:344
        */        @Test
        public void TestJunit344() {
            org.joda.time.DateTimeComparator p47;
            org.joda.time.DateTimeFieldType w20;
            org.joda.time.DateTimeFieldType w28;
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            w28 = p47.getUpperLimit();
            p47.hashCode();
        }

        /*
         *Testcase Number:345
        */        @Test
        public void TestJunit345() {
            org.joda.time.Partial p78;
            org.joda.time.Years g96;
            org.joda.time.Duration l13;
            org.joda.time.Chronology g32;
            int[] x81;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.LocalDateTime h87;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType i68;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int d63;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            i68 = g96.getPeriodType();
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h87 = new org.joda.time.LocalDateTime(long1, g32);
            d63 = h87.getYearOfEra();
            assertTrue(p78.equals(p78));
        }

        /*
         *Testcase Number:346
        */        @Test
        public void TestJunit346() {
            boolean a58;
            org.joda.time.Years g96;
            org.joda.time.Duration l13;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType i68;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            i68 = g96.getPeriodType();
            a58 = g96.isGreaterThan(g96);
            g96.hashCode();
        }

        /*
         *Testcase Number:347
        */        @Test
        public void TestJunit347() {
            org.joda.time.Period y94;
            org.joda.time.Period g38;
            org.joda.time.Partial p78;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.Chronology g32;
            org.joda.time.YearMonth x86;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth a14;
            int[] x81;
            org.joda.time.MutablePeriod g78;
            org.joda.time.MutablePeriod k11;
            org.joda.time.PeriodType w78;
            long long3;
            long long1;
            int c30;
            int integer5;
            int integer3;
            org.joda.time.LocalDate h14;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            c30 = e6.getMillisOfDay();
            org.joda.time.DateTimeUtils.setCurrentMillisOffset(long3);
            integer5 = 2;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            g38 = y94.withDays(integer5);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            k11 = new org.joda.time.MutablePeriod(long3, w78, g32);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            y41.setInterval(long3, long3);
            y94.hashCode();
        }

        /*
         *Testcase Number:348
        */        @Test
        public void TestJunit348() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.MutablePeriod l42;
            java.lang.String a43;
            org.joda.time.IllegalInstantException c84;
            org.joda.time.LocalDateTime d3;
            org.joda.time.PeriodType p15;
            long long1;
            long long3;
            int integer3;
            int o52;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            d3 = new org.joda.time.LocalDateTime(long3);
            o52 = d3.getEra();
            z86.equals(z86);
        }

        /*
         *Testcase Number:349
        */        @Test
        public void TestJunit349() {
            org.joda.time.LocalDate h14;
            org.joda.time.DateTimeComparator p47;
            org.joda.time.DateTimeComparator b73;
            org.joda.time.DateTimeComparator q16;
            org.joda.time.Partial p78;
            org.joda.time.Partial a4;
            org.joda.time.Chronology g32;
            org.joda.time.DateTimeFieldType w20;
            org.joda.time.DateTimeFieldType w28;
            int[] x81;
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            b73 = org.joda.time.DateTimeComparator.getInstance(w20, w20);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            a4 = p78.without(w20);
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            w28 = p47.getUpperLimit();
            q16 = org.joda.time.DateTimeComparator.getInstance(w20, w28);
            assertTrue(h14.equals(h14));
        }

        /*
         *Testcase Number:350
        */        @Test
        public void TestJunit350() {
            org.joda.time.Years g96;
            org.joda.time.Years o2;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration l13;
            org.joda.time.LocalTime e6;
            org.joda.time.MutablePeriod l42;
            java.lang.String a43;
            org.joda.time.IllegalInstantException c84;
            org.joda.time.IllegalInstantException f91;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType c51;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            f91 = new org.joda.time.IllegalInstantException(a43);
            c51 = p15.withSecondsRemoved();
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            o2 = g96.dividedBy(integer3);
            g96.toString();
        }

        /*
         *Testcase Number:351
        */        @Test
        public void TestJunit351() {
            org.joda.time.Period j2;
            org.joda.time.Period s37;
            org.joda.time.Weeks r40;
            org.joda.time.Hours w14;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth a14;
            org.joda.time.MonthDay i63;
            org.joda.time.DateTimeFieldType[] g81;
            org.joda.time.LocalDateTime i60;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int j57;
            int integer3;
            long long1;
            long long3;
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.Seconds z17;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Instant b82;
            org.joda.time.MutableInterval y41;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            z17 = r40.toStandardSeconds();
            w14 = r40.toStandardHours();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            g81 = a14.getFieldTypes();
            b82 = f20.toInstant();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            r7.setMillisOfDay(integer3);
            i63 = new org.joda.time.MonthDay(long3);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            j2 = org.joda.time.Period.months(integer4);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            s37 = org.joda.time.Period.days(integer2);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            i60 = new org.joda.time.LocalDateTime(integer5, integer3, integer3, integer5, integer5, integer4, integer5);
            assertTrue(j2.equals(j2));
        }

        /*
         *Testcase Number:352
        */        @Test
        public void TestJunit352() {
            org.joda.time.Period b24;
            org.joda.time.Period c6;
            org.joda.time.Partial p78;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Chronology g32;
            org.joda.time.YearMonth h28;
            int[] x81;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            b24 = new org.joda.time.Period(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            c6 = new org.joda.time.Period(long1, g32);
            h28 = new org.joda.time.YearMonth(long1, g32);
            b24.equals(b24);
        }

        /*
         *Testcase Number:353
        */        @Test
        public void TestJunit353() {
            org.joda.time.Years g96;
            org.joda.time.Duration l13;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType f70;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            long l24;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            l24 = l13.getStandardSeconds();
            f70 = p15.withMillisRemoved();
            g96.toString();
        }

        /*
         *Testcase Number:354
        */        @Test
        public void TestJunit354() {
            org.joda.time.Period p94;
            org.joda.time.Partial p78;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration l13;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth a14;
            org.joda.time.LocalTime e6;
            org.joda.time.Chronology g32;
            int[] x81;
            org.joda.time.MutablePeriod l42;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.LocalDateTime h87;
            org.joda.time.LocalDateTime i12;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType i68;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int c48;
            int g59;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            org.joda.time.Years g96;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            java.lang.Object d96;
            java.lang.String a43;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            p94 = org.joda.time.Period.minutes(integer3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            d96 = l42.clone();
            c48 = e6.getMillisOfSecond();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            g59 = e6.getSecondOfMinute();
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            i68 = g96.getPeriodType();
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h87 = new org.joda.time.LocalDateTime(long1, g32);
            i12 = h87.withTime(integer3, integer3, integer3, integer3);
            p94.toString();
        }

        /*
         *Testcase Number:355
        */        @Test
        public void TestJunit355() {
            org.joda.time.Period m38;
            org.joda.time.Partial p78;
            org.joda.time.Weeks r40;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration d58;
            org.joda.time.Duration f4;
            org.joda.time.Chronology g32;
            org.joda.time.YearMonth x86;
            org.joda.time.LocalTime x83;
            int[] x81;
            org.joda.time.MutablePeriod c54;
            org.joda.time.MutablePeriod k48;
            org.joda.time.MutablePeriod k73;
            org.joda.time.PeriodType y44;
            org.joda.time.PeriodType m3;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int j57;
            int integer3;
            long long1;
            long long3;
            org.joda.time.LocalDate h14;
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Instant e28;
            org.joda.time.MutableInterval y41;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            d58 = b98.multipliedBy(long3);
            e28 = z86.withMillis(long3);
            long3 = 10;
            y44 = org.joda.time.PeriodType.yearWeekDay();
            c54 = new org.joda.time.MutablePeriod(long3, long3, y44);
            m3 = y44.withMinutesRemoved();
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            integer4 = 4;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            f4 = org.joda.time.Duration.standardMinutes(long3);
            x83 = new org.joda.time.LocalTime(integer4, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            k48 = new org.joda.time.MutablePeriod(long3, long3, g32);
            k73 = new org.joda.time.MutablePeriod(integer5, integer5, integer3, integer4);
            m38.toString();
        }

        /*
         *Testcase Number:356
        */        @Test
        public void TestJunit356() {
            org.joda.time.Years g96;
            org.joda.time.Duration l13;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType p15;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            long l24;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int y42;
            int n48;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            l24 = l13.getStandardSeconds();
            y42 = g96.getYears();
            n48 = g96.getYears();
            assertTrue(g96.equals(g96));
        }

        /*
         *Testcase Number:357
        */        @Test
        public void TestJunit357() {
            org.joda.time.Period y94;
            org.joda.time.Period g38;
            org.joda.time.Period n83;
            org.joda.time.MutableInterval y41;
            org.joda.time.LocalTime e6;
            org.joda.time.Duration y79;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            long long3;
            int c30;
            int integer5;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            c30 = e6.getMillisOfDay();
            org.joda.time.DateTimeUtils.setCurrentMillisOffset(long3);
            integer5 = 2;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            g38 = y94.withDays(integer5);
            n83 = g38.withMillis(c30);
            y94.toString();
        }

        /*
         *Testcase Number:358
        */        @Test
        public void TestJunit358() {
            org.joda.time.Partial p78;
            org.joda.time.Partial j94;
            org.joda.time.Years g96;
            org.joda.time.Duration l13;
            org.joda.time.Chronology g32;
            int[] x81;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.LocalDateTime h87;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType i68;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            i68 = g96.getPeriodType();
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h87 = new org.joda.time.LocalDateTime(long1, g32);
            j94 = new org.joda.time.Partial(g32);
            p78.toString();
        }

        /*
         *Testcase Number:359
        */        @Test
        public void TestJunit359() {
            org.joda.time.Partial p78;
            org.joda.time.Period x75;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.Chronology g32;
            int[] x81;
            org.joda.time.MutablePeriod l42;
            org.joda.time.MutablePeriod k96;
            long long1;
            long long3;
            int integer3;
            int c48;
            int k4;
            org.joda.time.LocalDate h14;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            java.lang.Object d96;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            d96 = l42.clone();
            k96 = l42.copy();
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x75 = new org.joda.time.Period(d96, g32);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            d96 = l42.clone();
            c48 = e6.getMillisOfSecond();
            k4 = e6.getSecondOfMinute();
            y41.setDurationBeforeEnd(long3);
            p78.hashCode();
        }

        /*
         *Testcase Number:360
        */        @Test
        public void TestJunit360() {
            org.joda.time.Period v53;
            boolean g70;
            boolean y24;
            org.joda.time.Seconds d8;
            org.joda.time.Seconds z17;
            org.joda.time.Weeks r40;
            org.joda.time.Hours w14;
            org.joda.time.Days m20;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int j57;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            v53 = org.joda.time.Period.months(integer4);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            z17 = r40.toStandardSeconds();
            w14 = r40.toStandardHours();
            m20 = r40.toStandardDays();
            y24 = d8.isLessThan(d8);
            v53.equals(v53);
        }

        /*
         *Testcase Number:361
        */        @Test
        public void TestJunit361() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration m68;
            org.joda.time.LocalTime e6;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth a14;
            org.joda.time.DateTime e69;
            org.joda.time.DateTime p41;
            org.joda.time.MonthDay d81;
            org.joda.time.DateTimeFieldType[] y68;
            long long1;
            long long3;
            long long2;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            m68 = org.joda.time.Duration.millis(long1);
            y68 = i66.getFieldTypes();
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            d81 = new org.joda.time.MonthDay(long2);
            org.joda.time.DateTimeUtils.setCurrentMillisFixed(long2);
            p41 = e69.withTime(e6);
            z86.equals(z86);
        }

        /*
         *Testcase Number:362
        */        @Test
        public void TestJunit362() {
            org.joda.time.LocalDate h14;
            org.joda.time.Partial p78;
            org.joda.time.MutableInterval y75;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Chronology g32;
            org.joda.time.YearMonth x86;
            org.joda.time.YearMonth l50;
            org.joda.time.YearMonth z95;
            int[] x81;
            int integer3;
            long long1;
            long long3;
            integer3 = 6;
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            l50 = new org.joda.time.YearMonth(long3, g32);
            z95 = l50.withMonthOfYear(integer3);
            assertTrue(h14.equals(h14));
        }

        /*
         *Testcase Number:363
        */        @Test
        public void TestJunit363() {
            org.joda.time.LocalDate h14;
            org.joda.time.Partial p78;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration h16;
            org.joda.time.Chronology g32;
            org.joda.time.YearMonth x86;
            int[] x81;
            long long3;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            h16 = y79.abs();
            assertTrue(h14.equals(h14));
        }

        /*
         *Testcase Number:364
        */        @Test
        public void TestJunit364() {
            org.joda.time.PeriodType a93;
            a93 = org.joda.time.PeriodType.dayTime();
            a93.toString();
        }

        /*
         *Testcase Number:365
        */        @Test
        public void TestJunit365() {
            org.joda.time.Period m38;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Instant e28;
            org.joda.time.MutableInterval y41;
            org.joda.time.MutableInterval h81;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration d58;
            org.joda.time.LocalTime h68;
            org.joda.time.MutablePeriod g78;
            org.joda.time.MutablePeriod c54;
            org.joda.time.PeriodType w78;
            org.joda.time.PeriodType y44;
            long long3;
            long long1;
            int integer3;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            h68 = new org.joda.time.LocalTime(long3);
            org.joda.time.DateTimeUtils.setCurrentMillisOffset(long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            d58 = b98.multipliedBy(long3);
            e28 = z86.withMillis(long3);
            long3 = 10;
            y44 = org.joda.time.PeriodType.yearWeekDay();
            c54 = new org.joda.time.MutablePeriod(long3, long3, y44);
            h81 = new org.joda.time.MutableInterval(long3, long3);
            assertTrue(m38.equals(m38));
        }

        /*
         *Testcase Number:366
        */        @Test
        public void TestJunit366() {
            org.joda.time.Period m38;
            org.joda.time.Period m70;
            org.joda.time.Partial p78;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Chronology g32;
            org.joda.time.YearMonth x86;
            org.joda.time.YearMonth l50;
            org.joda.time.YearMonth z95;
            org.joda.time.LocalTime e6;
            int[] x81;
            org.joda.time.MutablePeriod l42;
            org.joda.time.IllegalInstantException c84;
            org.joda.time.LocalDateTime d3;
            org.joda.time.LocalDateTime x50;
            org.joda.time.PeriodType p15;
            long long1;
            long long3;
            long i68;
            int integer3;
            org.joda.time.LocalDate h14;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.MutableInterval y75;
            java.lang.String a43;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            m70 = m38.normalizedStandard();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            m70 = m38.normalizedStandard();
            i68 = b98.getStandardHours();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            integer3 = 6;
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            l50 = new org.joda.time.YearMonth(long3, g32);
            z95 = l50.withMonthOfYear(integer3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            d3 = new org.joda.time.LocalDateTime(long3);
            x50 = d3.withTime(integer3, integer3, integer3, integer3);
            m38.equals(m38);
        }

        /*
         *Testcase Number:367
        */        @Test
        public void TestJunit367() {
            org.joda.time.DateTime e69;
            org.joda.time.DateTime k73;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            org.joda.time.PeriodType a17;
            long long2;
            long long3;
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            y41.setDurationBeforeEnd(long2);
            k73 = e69.withEarlierOffsetAtOverlap();
            a17 = w78.withMonthsRemoved();
            e69.equals(e69);
        }

        /*
         *Testcase Number:368
        */        @Test
        public void TestJunit368() {
            org.joda.time.Partial p78;
            org.joda.time.Partial a4;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.Chronology g32;
            org.joda.time.YearMonth h60;
            int[] x81;
            org.joda.time.MutablePeriod l42;
            org.joda.time.MutableDateTime r7;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long long3;
            long long1;
            org.joda.time.LocalDate h14;
            org.joda.time.DateTimeComparator p47;
            org.joda.time.DateTimeComparator b73;
            org.joda.time.DateTimeComparator q16;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            java.lang.Object d96;
            org.joda.time.DateTimeFieldType w20;
            org.joda.time.DateTimeFieldType w28;
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            d96 = l42.clone();
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            b73 = org.joda.time.DateTimeComparator.getInstance(w20, w20);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            a4 = p78.without(w20);
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            w28 = p47.getUpperLimit();
            q16 = org.joda.time.DateTimeComparator.getInstance(w20, w28);
            h60 = new org.joda.time.YearMonth(integer4, integer3, g32);
            p78.hashCode();
        }

        /*
         *Testcase Number:369
        */        @Test
        public void TestJunit369() {
            org.joda.time.Partial p78;
            org.joda.time.Period x75;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.LocalTime g18;
            org.joda.time.Chronology g32;
            int[] x81;
            org.joda.time.MutablePeriod l42;
            org.joda.time.MutablePeriod k96;
            org.joda.time.IllegalInstantException c84;
            org.joda.time.IllegalInstantException f91;
            org.joda.time.PeriodType p15;
            long long1;
            long long3;
            int integer3;
            org.joda.time.LocalDate h14;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            java.lang.Object d96;
            java.lang.String a43;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            f91 = new org.joda.time.IllegalInstantException(a43);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            d96 = l42.clone();
            k96 = l42.copy();
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x75 = new org.joda.time.Period(d96, g32);
            g18 = org.joda.time.LocalTime.fromMillisOfDay(long3, g32);
            p78.hashCode();
        }

        /*
         *Testcase Number:370
        */        @Test
        public void TestJunit370() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.DateTime e69;
            org.joda.time.YearMonth i66;
            org.joda.time.MonthDay d81;
            java.lang.Object d96;
            org.joda.time.MutablePeriod l42;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            long long2;
            int integer3;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            d96 = l42.clone();
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            d81 = new org.joda.time.MonthDay(long2);
            org.joda.time.DateTimeUtils.setCurrentMillisFixed(long2);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMonthOfYear(integer3);
            r7.setMillis(long2);
            r7.setWeekyear(integer3);
            assertTrue(z86.equals(z86));
        }

        /*
         *Testcase Number:371
        */        @Test
        public void TestJunit371() {
            org.joda.time.PeriodType e97;
            e97 = org.joda.time.PeriodType.seconds();
            e97.hashCode();
        }

        /*
         *Testcase Number:372
        */        @Test
        public void TestJunit372() {
            org.joda.time.Period s57;
            org.joda.time.Years g96;
            org.joda.time.Duration l13;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType f70;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            long l24;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            l24 = l13.getStandardSeconds();
            f70 = p15.withMillisRemoved();
            s57 = org.joda.time.Period.minutes(integer1);
            s57.equals(s57);
        }

        /*
         *Testcase Number:373
        */        @Test
        public void TestJunit373() {
            java.util.Map<java.lang.String, org.joda.time.DateTimeZone> z95;
            z95 = org.joda.time.DateTimeUtils.getDefaultTimeZoneNames();
            z95.toString();
        }

        /*
         *Testcase Number:374
        */        @Test
        public void TestJunit374() {
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.DateTime e69;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            org.joda.time.PeriodType g96;
            long long1;
            long long3;
            long long2;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            y41.setDurationBeforeEnd(long2);
            g78.add(long3);
            g96 = w78.withWeeksRemoved();
            y41.toString();
        }

        /*
         *Testcase Number:375
        */        @Test
        public void TestJunit375() {
            java.util.Map<java.lang.String, org.joda.time.DateTimeZone> z95;
            z95 = org.joda.time.DateTimeUtils.getDefaultTimeZoneNames();
            org.joda.time.DateTimeUtils.setDefaultTimeZoneNames(z95);
            z95.toString();
        }

        /*
         *Testcase Number:376
        */        @Test
        public void TestJunit376() {
            org.joda.time.Partial p78;
            org.joda.time.Period z6;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.Chronology g32;
            int[] x81;
            org.joda.time.MutablePeriod l42;
            org.joda.time.PeriodType d44;
            long long1;
            long long3;
            long p16;
            int integer3;
            org.joda.time.LocalDate h14;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            java.lang.Object d96;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            d96 = l42.clone();
            d44 = org.joda.time.PeriodType.dayTime();
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            z6 = new org.joda.time.Period(d96, d44, g32);
            p16 = y79.getStandardSeconds();
            p78.equals(p78);
        }

        /*
         *Testcase Number:377
        */        @Test
        public void TestJunit377() {
            org.joda.time.Instant w89;
            w89 = new org.joda.time.Instant();
            w89.toString();
        }

        /*
         *Testcase Number:378
        */        @Test
        public void TestJunit378() {
            org.joda.time.Period m38;
            org.joda.time.Period m70;
            org.joda.time.Period w95;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth b53;
            org.joda.time.YearMonth t35;
            org.joda.time.DateTime e69;
            long long1;
            long long3;
            long n63;
            long long2;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            m70 = m38.normalizedStandard();
            w95 = m38.minusHours(integer3);
            n63 = org.joda.time.DateTimeUtils.toJulianDayNumber(long1);
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            b53 = new org.joda.time.YearMonth(long2);
            t35 = b53.plusMonths(integer3);
            m38.toString();
        }

        /*
         *Testcase Number:379
        */        @Test
        public void TestJunit379() {
            org.joda.time.Period s57;
            org.joda.time.Years g96;
            org.joda.time.Duration l13;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType f70;
            org.joda.time.PeriodType s73;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            long l24;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            l24 = l13.getStandardSeconds();
            f70 = p15.withMillisRemoved();
            s57 = org.joda.time.Period.minutes(integer1);
            s73 = g96.getPeriodType();
            s57.equals(s57);
        }

        /*
         *Testcase Number:380
        */        @Test
        public void TestJunit380() {
            org.joda.time.Period g99;
            g99 = new org.joda.time.Period();
            assertTrue(g99.equals(g99));
        }

        /*
         *Testcase Number:381
        */        @Test
        public void TestJunit381() {
            org.joda.time.PeriodType b81;
            b81 = org.joda.time.PeriodType.yearMonthDay();
            b81.equals(b81);
        }

        /*
         *Testcase Number:382
        */        @Test
        public void TestJunit382() {
            org.joda.time.LocalDate h14;
            org.joda.time.Partial p78;
            org.joda.time.MutableInterval y75;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Chronology g32;
            org.joda.time.YearMonth x86;
            org.joda.time.YearMonth l50;
            org.joda.time.YearMonth z95;
            int[] x81;
            int[] s41;
            int integer3;
            long long1;
            long long3;
            integer3 = 6;
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            l50 = new org.joda.time.YearMonth(long3, g32);
            z95 = l50.withMonthOfYear(integer3);
            s41 = p78.getValues();
            assertTrue(h14.equals(h14));
        }

        /*
         *Testcase Number:383
        */        @Test
        public void TestJunit383() {
            org.joda.time.Period s37;
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.Weeks r40;
            org.joda.time.Days w33;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int j57;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            s37 = org.joda.time.Period.days(integer2);
            w33 = r40.toStandardDays();
            assertTrue(s37.equals(s37));
        }

        /*
         *Testcase Number:384
        */        @Test
        public void TestJunit384() {
            org.joda.time.LocalDate s58;
            org.joda.time.DateTime e69;
            long long2;
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            s58 = new org.joda.time.LocalDate(long2);
            s58.toString();
        }

        /*
         *Testcase Number:385
        */        @Test
        public void TestJunit385() {
            org.joda.time.Period x78;
            org.joda.time.Years g96;
            org.joda.time.Instant q53;
            org.joda.time.Instant x94;
            org.joda.time.Duration l13;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType p15;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long1 = 7;
            q53 = org.joda.time.Instant.ofEpochSecond(long1);
            x94 = org.joda.time.Instant.ofEpochMilli(long1);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            x78 = new org.joda.time.Period(long1, long1, p15);
            x78.toString();
        }

        /*
         *Testcase Number:386
        */        @Test
        public void TestJunit386() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Instant k80;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            java.lang.Object d96;
            org.joda.time.MutablePeriod l42;
            long long1;
            long long3;
            int integer3;
            int c48;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            d96 = l42.clone();
            c48 = e6.getMillisOfSecond();
            k80 = org.joda.time.Instant.ofEpochSecond(long3);
            z86.toString();
        }

        /*
         *Testcase Number:387
        */        @Test
        public void TestJunit387() {
            org.joda.time.Period y94;
            org.joda.time.Period g38;
            org.joda.time.Partial p78;
            org.joda.time.LocalTime e6;
            org.joda.time.Duration y79;
            org.joda.time.Chronology g32;
            org.joda.time.YearMonth x86;
            org.joda.time.YearMonth l50;
            org.joda.time.YearMonth z95;
            org.joda.time.YearMonth l21;
            int[] x81;
            org.joda.time.MutablePeriod g78;
            org.joda.time.MutablePeriod k11;
            org.joda.time.PeriodType w78;
            long long3;
            long long1;
            int c30;
            int integer5;
            int integer3;
            org.joda.time.LocalDate h14;
            org.joda.time.MutableInterval y41;
            org.joda.time.MutableInterval y75;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            c30 = e6.getMillisOfDay();
            org.joda.time.DateTimeUtils.setCurrentMillisOffset(long3);
            integer5 = 2;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            g38 = y94.withDays(integer5);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            k11 = new org.joda.time.MutablePeriod(long3, w78, g32);
            integer3 = 6;
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            l50 = new org.joda.time.YearMonth(long3, g32);
            z95 = l50.withMonthOfYear(integer3);
            l21 = x86.minusMonths(c30);
            assertTrue(y94.equals(y94));
        }

        /*
         *Testcase Number:388
        */        @Test
        public void TestJunit388() {
            org.joda.time.Period m38;
            org.joda.time.Period m70;
            org.joda.time.Period w95;
            org.joda.time.Period g99;
            org.joda.time.Period s38;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.YearMonth i66;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            m70 = m38.normalizedStandard();
            w95 = m38.minusHours(integer3);
            g99 = new org.joda.time.Period();
            s38 = g99.withMillis(integer3);
            m38.toString();
        }

        /*
         *Testcase Number:389
        */        @Test
        public void TestJunit389() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.LocalTime h12;
            java.lang.Object d96;
            org.joda.time.MutablePeriod l42;
            long long1;
            long long3;
            int integer3;
            int c48;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            d96 = l42.clone();
            c48 = e6.getMillisOfSecond();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            d96 = l42.clone();
            h12 = e6.withHourOfDay(c48);
            assertTrue(z86.equals(z86));
        }

        /*
         *Testcase Number:390
        */        @Test
        public void TestJunit390() {
            org.joda.time.Period y94;
            org.joda.time.Period g38;
            org.joda.time.Period u94;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            org.joda.time.MutableDateTime r7;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long long3;
            long y70;
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            integer5 = 2;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            g38 = y94.withDays(integer5);
            u94 = g38.withYears(integer2);
            y70 = y79.getStandardSeconds();
            y94.equals(y94);
        }

        /*
         *Testcase Number:391
        */        @Test
        public void TestJunit391() {
            org.joda.time.Duration l13;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            long n72;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            n72 = org.joda.time.DateTimeUtils.toJulianDayNumber(long3);
            l13.toString();
        }

        /*
         *Testcase Number:392
        */        @Test
        public void TestJunit392() {
            org.joda.time.Partial p78;
            org.joda.time.Period l91;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration f4;
            org.joda.time.LocalTime e6;
            org.joda.time.LocalTime x83;
            org.joda.time.Chronology g32;
            org.joda.time.YearMonth x86;
            int[] x81;
            org.joda.time.MutablePeriod l42;
            org.joda.time.MutablePeriod k48;
            org.joda.time.IllegalInstantException c84;
            org.joda.time.IllegalInstantException f91;
            org.joda.time.IllegalFieldValueException e52;
            org.joda.time.PeriodType p15;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int integer3;
            org.joda.time.LocalDate h14;
            org.joda.time.DateTimeComparator p47;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.DateTimeFieldType w20;
            java.lang.String a43;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            f91 = new org.joda.time.IllegalInstantException(a43);
            e52 = new org.joda.time.IllegalFieldValueException(w20, a43);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            integer4 = 4;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            f4 = org.joda.time.Duration.standardMinutes(long3);
            x83 = new org.joda.time.LocalTime(integer4, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            k48 = new org.joda.time.MutablePeriod(long3, long3, g32);
            l91 = new org.joda.time.Period(long3, long3, g32);
            p78.hashCode();
        }

        /*
         *Testcase Number:393
        */        @Test
        public void TestJunit393() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration g73;
            org.joda.time.LocalTime e6;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            g73 = org.joda.time.Duration.standardHours(long3);
            z86.equals(z86);
        }

        /*
         *Testcase Number:394
        */        @Test
        public void TestJunit394() {
            org.joda.time.PeriodType i48;
            i48 = org.joda.time.PeriodType.yearDayTime();
            i48.toString();
        }

        /*
         *Testcase Number:395
        */        @Test
        public void TestJunit395() {
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.Seconds z17;
            org.joda.time.Weeks r40;
            org.joda.time.Hours w14;
            org.joda.time.Duration c64;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int j57;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            z17 = r40.toStandardSeconds();
            w14 = r40.toStandardHours();
            c64 = r40.toStandardDuration();
            d8.hashCode();
        }

        /*
         *Testcase Number:396
        */        @Test
        public void TestJunit396() {
            org.joda.time.Years g96;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Duration l13;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.MutableInterval y41;
            org.joda.time.LocalTime e6;
            org.joda.time.LocalTime o25;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth a14;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType p15;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int integer3;
            int g59;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            g59 = e6.getSecondOfMinute();
            o25 = e6.withSecondOfMinute(integer2);
            g96.toString();
        }

        /*
         *Testcase Number:397
        */        @Test
        public void TestJunit397() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.YearMonth i66;
            org.joda.time.DateTime w55;
            org.joda.time.LocalDateTime s24;
            org.joda.time.LocalDateTime i43;
            long long1;
            long long3;
            int integer3;
            int l58;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            w55 = new org.joda.time.DateTime(long3);
            s24 = new org.joda.time.LocalDateTime();
            i43 = s24.withYearOfEra(integer3);
            l58 = s24.getDayOfWeek();
            assertTrue(z86.equals(z86));
        }

        /*
         *Testcase Number:398
        */        @Test
        public void TestJunit398() {
            org.joda.time.LocalDate h14;
            org.joda.time.Partial p78;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Instant h39;
            org.joda.time.MutableInterval y41;
            org.joda.time.MutableInterval y75;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration f4;
            org.joda.time.Duration s32;
            org.joda.time.Duration t19;
            org.joda.time.Chronology g32;
            org.joda.time.YearMonth x86;
            org.joda.time.DateTime b28;
            int[] x81;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            int integer3;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            b28 = h14.toDateTimeAtCurrentTime();
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            f4 = org.joda.time.Duration.standardDays(long3);
            s32 = f4.multipliedBy(long3);
            t19 = org.joda.time.Duration.standardMinutes(long3);
            h39 = z86.withDurationAdded(long3, integer5);
            h14.toString();
        }

        /*
         *Testcase Number:399
        */        @Test
        public void TestJunit399() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.MutablePeriod l42;
            java.lang.String a43;
            org.joda.time.IllegalInstantException c84;
            org.joda.time.IllegalInstantException f91;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType c51;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int integer3;
            int t39;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            f91 = new org.joda.time.IllegalInstantException(a43);
            c51 = p15.withSecondsRemoved();
            t39 = e6.getMillisOfSecond();
            l42.setSeconds(integer2);
            z86.hashCode();
        }

        /*
         *Testcase Number:400
        */        @Test
        public void TestJunit400() {
            org.joda.time.Period s57;
            org.joda.time.Years g96;
            org.joda.time.Duration l13;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType f70;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            long l24;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int q47;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            l24 = l13.getStandardSeconds();
            f70 = p15.withMillisRemoved();
            s57 = org.joda.time.Period.minutes(integer1);
            q47 = g96.getYears();
            s57.hashCode();
        }

        /*
         *Testcase Number:401
        */        @Test
        public void TestJunit401() {
            org.joda.time.DateTimeComparator p47;
            org.joda.time.DateTimeComparator b73;
            org.joda.time.Years g96;
            org.joda.time.Duration l13;
            org.joda.time.MutableInterval t41;
            org.joda.time.MonthDay b46;
            org.joda.time.DateTimeFieldType w20;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType p15;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            long l24;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            l24 = l13.getStandardSeconds();
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            b73 = org.joda.time.DateTimeComparator.getInstance(w20, w20);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            org.joda.time.DateTimeUtils.setCurrentMillisOffset(long3);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMinuteOfDay(integer5);
            b46 = new org.joda.time.MonthDay(long3);
            r7.set(w20, integer1);
            t41 = new org.joda.time.MutableInterval(l24, long3);
            p47.toString();
        }

        /*
         *Testcase Number:402
        */        @Test
        public void TestJunit402() {
            org.joda.time.Partial p78;
            org.joda.time.Period z6;
            org.joda.time.Duration l13;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.Chronology g32;
            int[] x81;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.MutablePeriod l42;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType o55;
            org.joda.time.PeriodType d44;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            long p16;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int integer3;
            org.joda.time.LocalDate h14;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            java.lang.Object d96;
            java.lang.String a43;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            o55 = p15.withDaysRemoved();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            d96 = l42.clone();
            d44 = org.joda.time.PeriodType.dayTime();
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            z6 = new org.joda.time.Period(d96, d44, g32);
            p16 = y79.getStandardSeconds();
            l42.addDays(integer4);
            p78.equals(p78);
        }

        /*
         *Testcase Number:403
        */        @Test
        public void TestJunit403() {
            org.joda.time.Period x78;
            org.joda.time.Years g96;
            org.joda.time.Instant q53;
            org.joda.time.Instant x94;
            org.joda.time.Duration l13;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType p15;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            long1 = 7;
            q53 = org.joda.time.Instant.ofEpochSecond(long1);
            x94 = org.joda.time.Instant.ofEpochMilli(long1);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            x78 = new org.joda.time.Period(long1, long1, p15);
            r7.setDayOfWeek(integer4);
            assertTrue(x78.equals(x78));
        }

        /*
         *Testcase Number:404
        */        @Test
        public void TestJunit404() {
            org.joda.time.Period y94;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.MutablePeriod g78;
            org.joda.time.MutablePeriod z42;
            org.joda.time.PeriodType w78;
            long long3;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            z42 = new org.joda.time.MutablePeriod(long3);
            assertTrue(y94.equals(y94));
        }

        /*
         *Testcase Number:405
        */        @Test
        public void TestJunit405() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration e36;
            org.joda.time.YearMonth i66;
            org.joda.time.DateTime e69;
            org.joda.time.MonthDay d81;
            org.joda.time.MutablePeriod x96;
            org.joda.time.PeriodType h34;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            long long2;
            int integer3;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMonthOfYear(integer3);
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            d81 = new org.joda.time.MonthDay(long2);
            h34 = org.joda.time.PeriodType.millis();
            x96 = new org.joda.time.MutablePeriod(long3, long2, h34);
            e36 = org.joda.time.Duration.standardDays(long3);
            assertTrue(z86.equals(z86));
        }

        /*
         *Testcase Number:406
        */        @Test
        public void TestJunit406() {
            org.joda.time.Period m38;
            org.joda.time.Period p19;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.LocalTime e6;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration d58;
            org.joda.time.Duration v85;
            org.joda.time.DateTime e69;
            org.joda.time.DateTime y20;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            long long3;
            long long1;
            long long2;
            int c30;
            int integer3;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            c30 = e6.getMillisOfDay();
            long3 = 10;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            d58 = b98.multipliedBy(long3);
            p19 = m38.withMonths(c30);
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            y41.setDurationBeforeEnd(long2);
            v85 = org.joda.time.Duration.millis(long3);
            y20 = e69.withTime(e6);
            m38.toString();
        }

        /*
         *Testcase Number:407
        */        @Test
        public void TestJunit407() {
            org.joda.time.YearMonth z28;
            z28 = new org.joda.time.YearMonth();
            z28.hashCode();
        }

        /*
         *Testcase Number:408
        */        @Test
        public void TestJunit408() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.MutableInterval y75;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration f4;
            org.joda.time.Duration s32;
            org.joda.time.MutableDateTime c14;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            f4 = org.joda.time.Duration.standardDays(long3);
            s32 = f4.multipliedBy(long3);
            c14 = new org.joda.time.MutableDateTime(long1);
            z86.equals(z86);
        }

        /*
         *Testcase Number:409
        */        @Test
        public void TestJunit409() {
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.DateTime e69;
            org.joda.time.MonthDay d81;
            org.joda.time.MonthDay d67;
            org.joda.time.MutablePeriod l42;
            org.joda.time.IllegalInstantException c84;
            org.joda.time.IllegalInstantException f91;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType c51;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            long long2;
            int integer3;
            int t39;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            java.lang.String a43;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            f91 = new org.joda.time.IllegalInstantException(a43);
            c51 = p15.withSecondsRemoved();
            t39 = e6.getMillisOfSecond();
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            d81 = new org.joda.time.MonthDay(long2);
            d67 = d81.withDayOfMonth(integer5);
            r7.setWeekOfWeekyear(t39);
            y79.toString();
        }

        /*
         *Testcase Number:410
        */        @Test
        public void TestJunit410() {
            org.joda.time.DateTimeComparator p47;
            org.joda.time.Partial r43;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.DateTimeFieldType w20;
            org.joda.time.DateTimeFieldType w28;
            long long1;
            long long3;
            int integer3;
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            w28 = p47.getUpperLimit();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            r43 = new org.joda.time.Partial(w20, integer3);
            assertTrue(p47.equals(p47));
        }

        /*
         *Testcase Number:411
        */        @Test
        public void TestJunit411() {
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            long long3;
            long u43;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            u43 = y79.getStandardHours();
            y41.toString();
        }

        /*
         *Testcase Number:412
        */        @Test
        public void TestJunit412() {
            org.joda.time.Duration x89;
            org.joda.time.MutableDateTime r7;
            long long3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMinuteOfDay(integer5);
            x89 = org.joda.time.Duration.standardDays(long3);
            assertTrue(x89.equals(x89));
        }

        /*
         *Testcase Number:413
        */        @Test
        public void TestJunit413() {
            org.joda.time.Period b24;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.DateTime e69;
            org.joda.time.DateTime n43;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth q10;
            org.joda.time.MonthDay d81;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            long long2;
            int integer3;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            b24 = new org.joda.time.Period(long3);
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            d81 = new org.joda.time.MonthDay(long2);
            org.joda.time.DateTimeUtils.setCurrentMillisFixed(long2);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMonthOfYear(integer3);
            r7.setMillis(long2);
            n43 = e69.toDateTimeISO();
            q10 = i66.plusYears(integer3);
            b24.equals(b24);
        }

        /*
         *Testcase Number:414
        */        @Test
        public void TestJunit414() {
            org.joda.time.Period x78;
            org.joda.time.Years g96;
            org.joda.time.Years m27;
            org.joda.time.Instant q53;
            org.joda.time.Instant x94;
            org.joda.time.Duration l13;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType p15;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long1 = 7;
            q53 = org.joda.time.Instant.ofEpochSecond(long1);
            x94 = org.joda.time.Instant.ofEpochMilli(long1);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            x78 = new org.joda.time.Period(long1, long1, p15);
            long1 = 7;
            q53 = org.joda.time.Instant.ofEpochSecond(long1);
            x94 = org.joda.time.Instant.ofEpochMilli(long1);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            x78 = new org.joda.time.Period(long1, long1, p15);
            m27 = g96.minus(g96);
            x78.toString();
        }

        /*
         *Testcase Number:415
        */        @Test
        public void TestJunit415() {
            org.joda.time.Period s37;
            boolean g70;
            boolean j8;
            org.joda.time.Seconds d8;
            org.joda.time.Seconds z17;
            org.joda.time.Weeks r40;
            org.joda.time.Hours w14;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int j57;
            int p65;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            s37 = org.joda.time.Period.days(integer2);
            p65 = s37.getHours();
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            z17 = r40.toStandardSeconds();
            w14 = r40.toStandardHours();
            j8 = r40.isGreaterThan(r40);
            s37.toString();
        }

        /*
         *Testcase Number:416
        */        @Test
        public void TestJunit416() {
            org.joda.time.Period s57;
            org.joda.time.Period y94;
            org.joda.time.Period g38;
            org.joda.time.Period u94;
            org.joda.time.Period m38;
            org.joda.time.Period m70;
            org.joda.time.Period w95;
            org.joda.time.Duration l13;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration g73;
            org.joda.time.LocalTime e6;
            org.joda.time.YearMonth i66;
            org.joda.time.DateTime e69;
            org.joda.time.DateTime n43;
            org.joda.time.MonthDay d81;
            org.joda.time.MonthDay v57;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.MutablePeriod g78;
            org.joda.time.MutablePeriod x96;
            org.joda.time.MutablePeriod q30;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType f70;
            org.joda.time.PeriodType w78;
            org.joda.time.PeriodType h34;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            long l24;
            long long2;
            long n63;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int integer3;
            org.joda.time.Years g96;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            java.lang.String a43;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            l24 = l13.getStandardSeconds();
            f70 = p15.withMillisRemoved();
            s57 = org.joda.time.Period.minutes(integer1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            g73 = org.joda.time.Duration.standardHours(long3);
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            integer5 = 2;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            g38 = y94.withDays(integer5);
            u94 = g38.withYears(integer2);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMonthOfYear(integer3);
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            d81 = new org.joda.time.MonthDay(long2);
            h34 = org.joda.time.PeriodType.millis();
            x96 = new org.joda.time.MutablePeriod(long3, long2, h34);
            integer4 = 4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            org.joda.time.DateTimeUtils.setCurrentMillisOffset(long3);
            v57 = new org.joda.time.MonthDay(integer4, integer5);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            m70 = m38.normalizedStandard();
            w95 = m38.minusHours(integer3);
            n63 = org.joda.time.DateTimeUtils.toJulianDayNumber(long1);
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            d81 = new org.joda.time.MonthDay(long2);
            org.joda.time.DateTimeUtils.setCurrentMillisFixed(long2);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMonthOfYear(integer3);
            r7.setMillis(long2);
            n43 = e69.toDateTimeISO();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMonthOfYear(integer3);
            q30 = new org.joda.time.MutablePeriod(integer4, integer3, integer5, integer4, integer5, integer3, integer2, integer5);
            s57.toString();
        }

        /*
         *Testcase Number:417
        */        @Test
        public void TestJunit417() {
            org.joda.time.LocalDate h14;
            org.joda.time.DateTimeComparator p47;
            org.joda.time.DateTimeComparator b73;
            org.joda.time.DateTimeComparator z53;
            org.joda.time.Partial p78;
            org.joda.time.Partial a4;
            org.joda.time.Chronology g32;
            org.joda.time.DateTimeFieldType w20;
            int[] x81;
            org.joda.time.LocalDateTime y2;
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            b73 = org.joda.time.DateTimeComparator.getInstance(w20, w20);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            a4 = p78.without(w20);
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            b73 = org.joda.time.DateTimeComparator.getInstance(w20, w20);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            a4 = p78.without(w20);
            z53 = org.joda.time.DateTimeComparator.getInstance(w20, w20);
            y2 = new org.joda.time.LocalDateTime(g32);
            h14.hashCode();
        }

        /*
         *Testcase Number:418
        */        @Test
        public void TestJunit418() {
            org.joda.time.Partial p78;
            org.joda.time.Period c6;
            org.joda.time.Period i41;
            org.joda.time.Chronology g32;
            int[] x81;
            org.joda.time.MutableDateTime r7;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            long long1;
            integer4 = 4;
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            c6 = new org.joda.time.Period(long1, g32);
            i41 = c6.withDays(integer4);
            p78.equals(p78);
        }

        /*
         *Testcase Number:419
        */        @Test
        public void TestJunit419() {
            org.joda.time.PeriodType f56;
            f56 = org.joda.time.PeriodType.dayTime();
            f56.equals(f56);
        }

        /*
         *Testcase Number:420
        */        @Test
        public void TestJunit420() {
            org.joda.time.DateTime e69;
            org.joda.time.DateTime k73;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.MutablePeriod g78;
            org.joda.time.LocalDateTime p73;
            org.joda.time.PeriodType w78;
            long long2;
            long long3;
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            y41.setDurationBeforeEnd(long2);
            k73 = e69.withEarlierOffsetAtOverlap();
            p73 = new org.joda.time.LocalDateTime(long3);
            assertTrue(e69.equals(e69));
        }

        /*
         *Testcase Number:421
        */        @Test
        public void TestJunit421() {
            org.joda.time.Period y94;
            org.joda.time.Period g38;
            org.joda.time.Period z78;
            org.joda.time.Partial p78;
            org.joda.time.LocalTime e6;
            org.joda.time.Duration y79;
            org.joda.time.Duration h16;
            org.joda.time.Chronology g32;
            org.joda.time.YearMonth x86;
            int[] x81;
            org.joda.time.MutablePeriod g78;
            org.joda.time.MutablePeriod k11;
            org.joda.time.PeriodType w78;
            long long3;
            int c30;
            int integer5;
            org.joda.time.LocalDate h14;
            org.joda.time.MutableInterval y41;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            c30 = e6.getMillisOfDay();
            org.joda.time.DateTimeUtils.setCurrentMillisOffset(long3);
            integer5 = 2;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            g38 = y94.withDays(integer5);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            k11 = new org.joda.time.MutablePeriod(long3, w78, g32);
            integer5 = 2;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            g38 = y94.withDays(integer5);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            h16 = y79.abs();
            z78 = new org.joda.time.Period(long3, w78, g32);
            y94.toString();
        }

        /*
         *Testcase Number:422
        */        @Test
        public void TestJunit422() {
            org.joda.time.Partial p78;
            org.joda.time.Partial a4;
            org.joda.time.Partial c55;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth a14;
            org.joda.time.Chronology g32;
            int[] x81;
            org.joda.time.DateTimeFieldType[] g81;
            org.joda.time.LocalDateTime y2;
            long long1;
            long long3;
            int integer3;
            org.joda.time.LocalDate h14;
            org.joda.time.DateTimeComparator p47;
            org.joda.time.DateTimeComparator b73;
            org.joda.time.DateTimeComparator z53;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Instant b82;
            org.joda.time.MutableInterval y41;
            org.joda.time.DateTimeFieldType w20;
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            b73 = org.joda.time.DateTimeComparator.getInstance(w20, w20);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            g81 = a14.getFieldTypes();
            b82 = f20.toInstant();
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            b73 = org.joda.time.DateTimeComparator.getInstance(w20, w20);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            a4 = p78.without(w20);
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            b73 = org.joda.time.DateTimeComparator.getInstance(w20, w20);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            a4 = p78.without(w20);
            z53 = org.joda.time.DateTimeComparator.getInstance(w20, w20);
            y2 = new org.joda.time.LocalDateTime(g32);
            c55 = new org.joda.time.Partial(w20, integer3, g32);
            p78.equals(p78);
        }

        /*
         *Testcase Number:423
        */        @Test
        public void TestJunit423() {
            org.joda.time.Period m38;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Instant e28;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration d58;
            org.joda.time.Duration p74;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            d58 = b98.multipliedBy(long3);
            e28 = z86.withMillis(long3);
            p74 = y79.toDuration();
            m38.toString();
        }

        /*
         *Testcase Number:424
        */        @Test
        public void TestJunit424() {
            org.joda.time.Partial p78;
            org.joda.time.Period c6;
            org.joda.time.Chronology g32;
            int[] x81;
            org.joda.time.MutableDateTime r7;
            org.joda.time.MutableDateTime u47;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            c6 = new org.joda.time.Period(long1, g32);
            u47 = new org.joda.time.MutableDateTime(g32);
            assertTrue(p78.equals(p78));
        }

        /*
         *Testcase Number:425
        */        @Test
        public void TestJunit425() {
            org.joda.time.Period m38;
            org.joda.time.Period m70;
            org.joda.time.Period w42;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Instant g30;
            org.joda.time.Instant c6;
            org.joda.time.MutableInterval y41;
            org.joda.time.MutableInterval y75;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration f4;
            org.joda.time.Duration l13;
            org.joda.time.LocalTime h68;
            org.joda.time.MutablePeriod g78;
            org.joda.time.MutablePeriod v77;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType w78;
            org.joda.time.PeriodType p15;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            long i68;
            long l25;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            m70 = m38.normalizedStandard();
            i68 = b98.getStandardHours();
            w42 = m38.toPeriod();
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            f4 = org.joda.time.Duration.standardDays(long3);
            l25 = f4.getStandardSeconds();
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            h68 = new org.joda.time.LocalTime(long3);
            g30 = org.joda.time.Instant.ofEpochSecond(long3);
            c6 = g30.withMillis(long1);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y41.setDurationAfterStart(long1);
            v77 = new org.joda.time.MutablePeriod(i68, long3, p15);
            m38.hashCode();
        }

        /*
         *Testcase Number:426
        */        @Test
        public void TestJunit426() {
            org.joda.time.Period m38;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Instant e28;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration d58;
            org.joda.time.MutablePeriod c54;
            org.joda.time.MutablePeriod c39;
            org.joda.time.PeriodType y44;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            d58 = b98.multipliedBy(long3);
            e28 = z86.withMillis(long3);
            long3 = 10;
            y44 = org.joda.time.PeriodType.yearWeekDay();
            c54 = new org.joda.time.MutablePeriod(long3, long3, y44);
            c39 = new org.joda.time.MutablePeriod(long3);
            assertTrue(m38.equals(m38));
        }

        /*
         *Testcase Number:427
        */        @Test
        public void TestJunit427() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Instant k80;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            java.lang.Object d96;
            org.joda.time.MutablePeriod l42;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int c48;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            d96 = l42.clone();
            c48 = e6.getMillisOfSecond();
            k80 = org.joda.time.Instant.ofEpochSecond(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMonthOfYear(c48);
            assertTrue(z86.equals(z86));
        }

        /*
         *Testcase Number:428
        */        @Test
        public void TestJunit428() {
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.MutablePeriod l42;
            org.joda.time.IllegalInstantException c84;
            org.joda.time.IllegalInstantException f91;
            org.joda.time.IllegalFieldValueException e52;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType l23;
            long long1;
            long long3;
            int integer3;
            org.joda.time.DateTimeComparator p47;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.DateTimeFieldType w20;
            java.lang.String a43;
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            f91 = new org.joda.time.IllegalInstantException(a43);
            e52 = new org.joda.time.IllegalFieldValueException(w20, a43);
            l23 = p15.withWeeksRemoved();
            y79.toString();
        }

        /*
         *Testcase Number:429
        */        @Test
        public void TestJunit429() {
            boolean g70;
            boolean r49;
            org.joda.time.Seconds d8;
            org.joda.time.Seconds z17;
            org.joda.time.Weeks r40;
            org.joda.time.Hours w14;
            org.joda.time.Duration c64;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int j57;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            z17 = r40.toStandardSeconds();
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            z17 = r40.toStandardSeconds();
            w14 = r40.toStandardHours();
            c64 = r40.toStandardDuration();
            r49 = r40.isLessThan(r40);
            d8.hashCode();
        }

        /*
         *Testcase Number:430
        */        @Test
        public void TestJunit430() {
            org.joda.time.Period s37;
            org.joda.time.Period z6;
            org.joda.time.Period i77;
            org.joda.time.Partial p78;
            org.joda.time.Weeks r40;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.Chronology g32;
            int[] x81;
            org.joda.time.MutablePeriod l42;
            org.joda.time.PeriodType d44;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int j57;
            int integer3;
            long long3;
            long long1;
            long p16;
            org.joda.time.LocalDate h14;
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            java.lang.Object d96;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            s37 = org.joda.time.Period.days(integer2);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            org.joda.time.DateTimeUtils.setCurrentMillisOffset(long3);
            r7.setMinuteOfHour(integer2);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            d96 = l42.clone();
            d44 = org.joda.time.PeriodType.dayTime();
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            z6 = new org.joda.time.Period(d96, d44, g32);
            p16 = y79.getStandardSeconds();
            i77 = new org.joda.time.Period(long3, d44);
            s37.toString();
        }

        /*
         *Testcase Number:431
        */        @Test
        public void TestJunit431() {
            org.joda.time.Period m38;
            org.joda.time.Period s37;
            org.joda.time.Period g87;
            org.joda.time.Weeks r40;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration d58;
            org.joda.time.Duration s66;
            org.joda.time.Duration l13;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth a14;
            org.joda.time.DateTime e69;
            org.joda.time.LocalTime e6;
            org.joda.time.MonthDay d81;
            org.joda.time.MutablePeriod c54;
            org.joda.time.MutablePeriod x96;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType y44;
            org.joda.time.PeriodType m3;
            org.joda.time.PeriodType h34;
            org.joda.time.PeriodType p15;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            long long2;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int j57;
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.Years g96;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Instant e28;
            org.joda.time.MutableInterval y41;
            java.lang.String a43;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            d58 = b98.multipliedBy(long3);
            e28 = z86.withMillis(long3);
            long3 = 10;
            y44 = org.joda.time.PeriodType.yearWeekDay();
            c54 = new org.joda.time.MutablePeriod(long3, long3, y44);
            m3 = y44.withMinutesRemoved();
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            s37 = org.joda.time.Period.days(integer2);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            org.joda.time.DateTimeUtils.setCurrentMillisOffset(long3);
            r7.setMinuteOfHour(integer2);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMonthOfYear(integer3);
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            d81 = new org.joda.time.MonthDay(long2);
            h34 = org.joda.time.PeriodType.millis();
            x96 = new org.joda.time.MutablePeriod(long3, long2, h34);
            s66 = y79.toDuration();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            d58 = b98.multipliedBy(long3);
            e28 = z86.withMillis(long3);
            long3 = 10;
            y44 = org.joda.time.PeriodType.yearWeekDay();
            c54 = new org.joda.time.MutablePeriod(long3, long3, y44);
            m3 = y44.withMinutesRemoved();
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            org.joda.time.DateTimeUtils.setCurrentMillisOffset(long3);
            g87 = new org.joda.time.Period(integer3, integer4, integer4, integer3, integer5, integer4, integer3, integer5);
            assertTrue(m38.equals(m38));
        }

        /*
         *Testcase Number:432
        */        @Test
        public void TestJunit432() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.MutableInterval y75;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration f4;
            org.joda.time.Duration s32;
            org.joda.time.Duration t19;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            f4 = org.joda.time.Duration.standardDays(long3);
            s32 = f4.multipliedBy(long3);
            t19 = org.joda.time.Duration.standardMinutes(long3);
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            y41.setInterval(long1, long3);
            assertTrue(z86.equals(z86));
        }

        /*
         *Testcase Number:433
        */        @Test
        public void TestJunit433() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration s66;
            org.joda.time.Duration x89;
            org.joda.time.YearMonth i66;
            org.joda.time.DateTime e69;
            org.joda.time.MonthDay d81;
            org.joda.time.MutablePeriod x96;
            org.joda.time.PeriodType h34;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            long long2;
            int integer3;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMonthOfYear(integer3);
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            d81 = new org.joda.time.MonthDay(long2);
            h34 = org.joda.time.PeriodType.millis();
            x96 = new org.joda.time.MutablePeriod(long3, long2, h34);
            s66 = y79.toDuration();
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMinuteOfDay(integer5);
            x89 = org.joda.time.Duration.standardDays(long3);
            r7.setTime(long3);
            z86.toString();
        }

        /*
         *Testcase Number:434
        */        @Test
        public void TestJunit434() {
            org.joda.time.PeriodType z44;
            z44 = org.joda.time.PeriodType.time();
            z44.hashCode();
        }

        /*
         *Testcase Number:435
        */        @Test
        public void TestJunit435() {
            org.joda.time.Period j2;
            org.joda.time.Period l57;
            org.joda.time.Partial p78;
            org.joda.time.Partial a4;
            org.joda.time.Weeks r40;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration x89;
            org.joda.time.YearMonth i66;
            org.joda.time.DateTime w55;
            org.joda.time.Hours w14;
            org.joda.time.Chronology g32;
            org.joda.time.MonthDay v57;
            int[] x81;
            org.joda.time.LocalDateTime s24;
            org.joda.time.LocalDateTime i43;
            org.joda.time.LocalDateTime y2;
            org.joda.time.LocalDateTime k89;
            org.joda.time.MutableDateTime r7;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            int integer3;
            int j57;
            long long3;
            long long1;
            org.joda.time.LocalDate h14;
            org.joda.time.DateTimeComparator p47;
            org.joda.time.DateTimeComparator b73;
            org.joda.time.DateTimeComparator z53;
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.Seconds z17;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Days m20;
            org.joda.time.DateTimeFieldType w20;
            integer4 = 4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            org.joda.time.DateTimeUtils.setCurrentMillisOffset(long3);
            v57 = new org.joda.time.MonthDay(integer4, integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            j2 = org.joda.time.Period.months(integer4);
            l57 = j2.withWeeks(integer4);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            w55 = new org.joda.time.DateTime(long3);
            s24 = new org.joda.time.LocalDateTime();
            i43 = s24.withYearOfEra(integer3);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMinuteOfDay(integer5);
            x89 = org.joda.time.Duration.standardDays(long3);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            z17 = r40.toStandardSeconds();
            w14 = r40.toStandardHours();
            m20 = r40.toStandardDays();
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            b73 = org.joda.time.DateTimeComparator.getInstance(w20, w20);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            a4 = p78.without(w20);
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            b73 = org.joda.time.DateTimeComparator.getInstance(w20, w20);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            a4 = p78.without(w20);
            z53 = org.joda.time.DateTimeComparator.getInstance(w20, w20);
            y2 = new org.joda.time.LocalDateTime(g32);
            k89 = y2.withTime(integer1, integer3, integer5, integer5);
            assertTrue(j2.equals(j2));
        }

        /*
         *Testcase Number:436
        */        @Test
        public void TestJunit436() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.MutablePeriod l42;
            java.lang.String a43;
            org.joda.time.IllegalInstantException c84;
            org.joda.time.LocalDateTime d3;
            org.joda.time.PeriodType p15;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            r7.setMillisOfDay(integer3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            d3 = new org.joda.time.LocalDateTime(long3);
            l42.addSeconds(integer5);
            z86.toString();
        }

        /*
         *Testcase Number:437
        */        @Test
        public void TestJunit437() {
            org.joda.time.Period s37;
            boolean g70;
            boolean k84;
            org.joda.time.Seconds d8;
            org.joda.time.Seconds z17;
            org.joda.time.Weeks r40;
            org.joda.time.Hours w14;
            org.joda.time.Days m20;
            org.joda.time.Days w33;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int j57;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            z17 = r40.toStandardSeconds();
            w14 = r40.toStandardHours();
            m20 = r40.toStandardDays();
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            s37 = org.joda.time.Period.days(integer2);
            w33 = r40.toStandardDays();
            k84 = w33.isLessThan(m20);
            s37.toString();
        }

        /*
         *Testcase Number:438
        */        @Test
        public void TestJunit438() {
            org.joda.time.Partial p78;
            org.joda.time.Period c6;
            org.joda.time.Period g18;
            org.joda.time.Chronology g32;
            int[] x81;
            org.joda.time.MutableDateTime r7;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            c6 = new org.joda.time.Period(long1, g32);
            g18 = c6.toPeriod();
            p78.equals(p78);
        }

        /*
         *Testcase Number:439
        */        @Test
        public void TestJunit439() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration s66;
            org.joda.time.YearMonth i66;
            org.joda.time.DateTime e69;
            org.joda.time.MonthDay d81;
            org.joda.time.MutablePeriod x96;
            org.joda.time.PeriodType h34;
            org.joda.time.PeriodType y55;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            long long2;
            int integer3;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMonthOfYear(integer3);
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            d81 = new org.joda.time.MonthDay(long2);
            h34 = org.joda.time.PeriodType.millis();
            x96 = new org.joda.time.MutablePeriod(long3, long2, h34);
            s66 = y79.toDuration();
            y55 = org.joda.time.DateTimeUtils.getPeriodType(h34);
            z86.toString();
        }

        /*
         *Testcase Number:440
        */        @Test
        public void TestJunit440() {
            org.joda.time.Period m38;
            org.joda.time.Period m70;
            org.joda.time.Period w95;
            org.joda.time.Period a94;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.YearMonth i66;
            java.lang.Object n18;
            org.joda.time.MutablePeriod l42;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            n18 = l42.clone();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            m70 = m38.normalizedStandard();
            w95 = m38.minusHours(integer3);
            a94 = m38.minusDays(integer3);
            m38.hashCode();
        }

        /*
         *Testcase Number:441
        */        @Test
        public void TestJunit441() {
            org.joda.time.LocalDate m98;
            org.joda.time.Years g96;
            org.joda.time.Duration l13;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType p15;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            m98 = new org.joda.time.LocalDate(long3);
            m98.hashCode();
        }

        /*
         *Testcase Number:442
        */        @Test
        public void TestJunit442() {
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.MutablePeriod l42;
            org.joda.time.IllegalInstantException c84;
            org.joda.time.IllegalInstantException f91;
            org.joda.time.IllegalFieldValueException e52;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType l23;
            long long1;
            long long3;
            int integer3;
            org.joda.time.DateTimeComparator p47;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.DateTimeFieldType w20;
            org.joda.time.DateTimeFieldType y72;
            java.lang.String a43;
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            f91 = new org.joda.time.IllegalInstantException(a43);
            e52 = new org.joda.time.IllegalFieldValueException(w20, a43);
            l23 = p15.withWeeksRemoved();
            y72 = e52.getDateTimeFieldType();
            y79.hashCode();
        }

        /*
         *Testcase Number:443
        */        @Test
        public void TestJunit443() {
            org.joda.time.LocalDate a33;
            org.joda.time.Instant g30;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.LocalTime h68;
            org.joda.time.DateTime q59;
            org.joda.time.MutablePeriod g78;
            org.joda.time.LocalDateTime b80;
            org.joda.time.PeriodType w78;
            long long3;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            h68 = new org.joda.time.LocalTime(long3);
            g30 = org.joda.time.Instant.ofEpochSecond(long3);
            a33 = new org.joda.time.LocalDate();
            q59 = a33.toDateTimeAtCurrentTime();
            b80 = a33.toLocalDateTime(h68);
            a33.equals(a33);
        }

        /*
         *Testcase Number:444
        */        @Test
        public void TestJunit444() {
            org.joda.time.LocalDate h14;
            org.joda.time.DateTimeComparator p47;
            org.joda.time.DateTimeComparator b73;
            org.joda.time.DateTimeComparator z53;
            org.joda.time.DateTimeComparator y69;
            org.joda.time.Partial p78;
            org.joda.time.Partial a4;
            org.joda.time.Chronology g32;
            org.joda.time.DateTimeFieldType w20;
            int[] x81;
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            b73 = org.joda.time.DateTimeComparator.getInstance(w20, w20);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            a4 = p78.without(w20);
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            b73 = org.joda.time.DateTimeComparator.getInstance(w20, w20);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            a4 = p78.without(w20);
            z53 = org.joda.time.DateTimeComparator.getInstance(w20, w20);
            y69 = org.joda.time.DateTimeComparator.getInstance(w20);
            h14.equals(h14);
        }

        /*
         *Testcase Number:445
        */        @Test
        public void TestJunit445() {
            org.joda.time.Years g96;
            org.joda.time.Duration l13;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType f70;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            long l24;
            long w43;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            l24 = l13.getStandardSeconds();
            f70 = p15.withMillisRemoved();
            w43 = l13.getStandardHours();
            g96.hashCode();
        }

        /*
         *Testcase Number:446
        */        @Test
        public void TestJunit446() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.MutablePeriod l42;
            java.lang.String a43;
            org.joda.time.IllegalInstantException c84;
            org.joda.time.LocalDateTime d3;
            org.joda.time.PeriodType p15;
            long long1;
            long long3;
            int integer3;
            int k90;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            d3 = new org.joda.time.LocalDateTime(long3);
            k90 = d3.getDayOfWeek();
            z86.equals(z86);
        }

        /*
         *Testcase Number:447
        */        @Test
        public void TestJunit447() {
            org.joda.time.Partial p78;
            org.joda.time.Period z6;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.Chronology g32;
            int[] x81;
            org.joda.time.MutablePeriod l42;
            org.joda.time.PeriodType d44;
            long long1;
            long long3;
            int integer3;
            int e83;
            org.joda.time.LocalDate h14;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            java.lang.Object d96;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            d96 = l42.clone();
            d44 = org.joda.time.PeriodType.dayTime();
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            z6 = new org.joda.time.Period(d96, d44, g32);
            e83 = e6.getSecondOfMinute();
            p78.hashCode();
        }

        /*
         *Testcase Number:448
        */        @Test
        public void TestJunit448() {
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.MutablePeriod l42;
            org.joda.time.IllegalInstantException c84;
            org.joda.time.IllegalInstantException f91;
            org.joda.time.IllegalFieldValueException e52;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType l23;
            long long1;
            long long3;
            int integer3;
            org.joda.time.DateTimeComparator p47;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.DateTimeFieldType w20;
            java.lang.String a43;
            java.lang.String i50;
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            f91 = new org.joda.time.IllegalInstantException(a43);
            e52 = new org.joda.time.IllegalFieldValueException(w20, a43);
            l23 = p15.withWeeksRemoved();
            i50 = e52.getIllegalValueAsString();
            y79.equals(y79);
        }

        /*
         *Testcase Number:449
        */        @Test
        public void TestJunit449() {
            org.joda.time.LocalDate i46;
            org.joda.time.DateTimeComparator p47;
            org.joda.time.DateTimeComparator b73;
            org.joda.time.Partial p78;
            org.joda.time.Chronology g32;
            org.joda.time.MonthDay b46;
            org.joda.time.DateTimeFieldType w20;
            int[] x81;
            org.joda.time.MutableDateTime r7;
            long long3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            b73 = org.joda.time.DateTimeComparator.getInstance(w20, w20);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            org.joda.time.DateTimeUtils.setCurrentMillisOffset(long3);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMinuteOfDay(integer5);
            b46 = new org.joda.time.MonthDay(long3);
            r7.set(w20, integer1);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            i46 = new org.joda.time.LocalDate(long3, g32);
            i46.equals(i46);
        }

        /*
         *Testcase Number:450
        */        @Test
        public void TestJunit450() {
            org.joda.time.Period m38;
            org.joda.time.Period m70;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.DateTime e69;
            org.joda.time.YearMonth i66;
            org.joda.time.MonthDay d81;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            long long2;
            int integer3;
            int s7;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            m70 = m38.normalizedStandard();
            s7 = m70.getMonths();
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            d81 = new org.joda.time.MonthDay(long2);
            org.joda.time.DateTimeUtils.setCurrentMillisFixed(long2);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMonthOfYear(integer3);
            r7.setMillis(long2);
            y41.setStartMillis(long3);
            assertTrue(m38.equals(m38));
        }

        /*
         *Testcase Number:451
        */        @Test
        public void TestJunit451() {
            org.joda.time.PeriodType h34;
            org.joda.time.PeriodType v76;
            h34 = org.joda.time.PeriodType.millis();
            v76 = h34.withMinutesRemoved();
            h34.equals(h34);
        }

        /*
         *Testcase Number:452
        */        @Test
        public void TestJunit452() {
            double a56;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.DateTime e69;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.YearMonth i66;
            org.joda.time.MonthDay d81;
            org.joda.time.MutableDateTime r7;
            long long2;
            long long1;
            long long3;
            int integer3;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            d81 = new org.joda.time.MonthDay(long2);
            org.joda.time.DateTimeUtils.setCurrentMillisFixed(long2);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMonthOfYear(integer3);
            r7.setMillis(long2);
            a56 = org.joda.time.DateTimeUtils.toJulianDay(long2);
            z86.toString();
        }

        /*
         *Testcase Number:453
        */        @Test
        public void TestJunit453() {
            org.joda.time.Partial p78;
            org.joda.time.Partial a4;
            org.joda.time.Period l20;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.Chronology g32;
            int[] x81;
            org.joda.time.MutablePeriod l42;
            org.joda.time.PeriodType a93;
            long long1;
            long long3;
            int integer3;
            int c48;
            int k4;
            org.joda.time.LocalDate h14;
            org.joda.time.DateTimeComparator p47;
            org.joda.time.DateTimeComparator b73;
            org.joda.time.DateTimeComparator z53;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            java.lang.Object d96;
            org.joda.time.DateTimeFieldType w20;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            d96 = l42.clone();
            c48 = e6.getMillisOfSecond();
            k4 = e6.getSecondOfMinute();
            a93 = org.joda.time.PeriodType.dayTime();
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            b73 = org.joda.time.DateTimeComparator.getInstance(w20, w20);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            a4 = p78.without(w20);
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            b73 = org.joda.time.DateTimeComparator.getInstance(w20, w20);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            a4 = p78.without(w20);
            z53 = org.joda.time.DateTimeComparator.getInstance(w20, w20);
            l20 = new org.joda.time.Period(d96, a93, g32);
            p78.equals(p78);
        }

        /*
         *Testcase Number:454
        */        @Test
        public void TestJunit454() {
            org.joda.time.Period y94;
            org.joda.time.Period g38;
            org.joda.time.Period n83;
            org.joda.time.Period b64;
            org.joda.time.MutableInterval y41;
            org.joda.time.LocalTime e6;
            org.joda.time.Duration y79;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            org.joda.time.MutableDateTime r7;
            int integer2;
            int c30;
            int integer5;
            int integer1;
            int integer4;
            long long3;
            long long1;
            integer2 = 10;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            c30 = e6.getMillisOfDay();
            org.joda.time.DateTimeUtils.setCurrentMillisOffset(long3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            c30 = e6.getMillisOfDay();
            org.joda.time.DateTimeUtils.setCurrentMillisOffset(long3);
            integer5 = 2;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            g38 = y94.withDays(integer5);
            n83 = g38.withMillis(c30);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setMinuteOfDay(integer2);
            b64 = new org.joda.time.Period(integer2, c30, c30, integer5);
            y94.hashCode();
        }

        /*
         *Testcase Number:455
        */        @Test
        public void TestJunit455() {
            org.joda.time.LocalTime q86;
            int m88;
            q86 = new org.joda.time.LocalTime();
            m88 = q86.getMinuteOfHour();
            q86.hashCode();
        }

        /*
         *Testcase Number:456
        */        @Test
        public void TestJunit456() {
            org.joda.time.Duration l13;
            org.joda.time.Duration y79;
            org.joda.time.MutableInterval y41;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType w78;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            g78.addYears(integer4);
            l13.equals(l13);
        }

        /*
         *Testcase Number:457
        */        @Test
        public void TestJunit457() {
            org.joda.time.Period v53;
            org.joda.time.Period y94;
            org.joda.time.Period g38;
            org.joda.time.Period u94;
            org.joda.time.Partial p78;
            org.joda.time.Duration y79;
            org.joda.time.Duration h16;
            org.joda.time.Chronology g32;
            org.joda.time.YearMonth x86;
            int[] x81;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int integer3;
            long long3;
            org.joda.time.LocalDate h14;
            org.joda.time.LocalDate k8;
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.MutableInterval y41;
            java.lang.Object w56;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            v53 = org.joda.time.Period.months(integer4);
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            integer5 = 2;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            g38 = y94.withDays(integer5);
            u94 = g38.withYears(integer2);
            w56 = g78.clone();
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            h16 = y79.abs();
            k8 = new org.joda.time.LocalDate(integer2, integer5, integer5, g32);
            v53.equals(v53);
        }

        /*
         *Testcase Number:458
        */        @Test
        public void TestJunit458() {
            org.joda.time.Duration l13;
            org.joda.time.Duration s25;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            long e8;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            s25 = l13.toDuration();
            e8 = org.joda.time.DateTimeUtils.toJulianDayNumber(long3);
            assertTrue(l13.equals(l13));
        }

        /*
         *Testcase Number:459
        */        @Test
        public void TestJunit459() {
            org.joda.time.LocalDate q18;
            org.joda.time.Period m38;
            org.joda.time.Period m70;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            long long1;
            long long3;
            long i68;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            m70 = m38.normalizedStandard();
            i68 = b98.getStandardHours();
            q18 = new org.joda.time.LocalDate(long3);
            q18.toString();
        }

        /*
         *Testcase Number:460
        */        @Test
        public void TestJunit460() {
            org.joda.time.LocalDate h14;
            org.joda.time.Partial p78;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Chronology g32;
            org.joda.time.YearMonth x86;
            org.joda.time.YearMonth l45;
            int[] x81;
            long long3;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            l45 = new org.joda.time.YearMonth(g32);
            h14.hashCode();
        }

        /*
         *Testcase Number:461
        */        @Test
        public void TestJunit461() {
            org.joda.time.Instant g30;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration h5;
            org.joda.time.LocalTime h68;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            long long3;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            h68 = new org.joda.time.LocalTime(long3);
            g30 = org.joda.time.Instant.ofEpochSecond(long3);
            h5 = org.joda.time.Duration.millis(long3);
            g30.equals(g30);
        }

        /*
         *Testcase Number:462
        */        @Test
        public void TestJunit462() {
            org.joda.time.Years g96;
            org.joda.time.Duration l13;
            org.joda.time.Duration s25;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType p15;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            long e8;
            long l24;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            s25 = l13.toDuration();
            e8 = org.joda.time.DateTimeUtils.toJulianDayNumber(long3);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            l24 = l13.getStandardSeconds();
            r7.setSecondOfMinute(integer1);
            g96.equals(g96);
        }

        /*
         *Testcase Number:463
        */        @Test
        public void TestJunit463() {
            org.joda.time.Partial p78;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth a14;
            org.joda.time.YearMonth x86;
            org.joda.time.Chronology g32;
            int[] x81;
            org.joda.time.DateTimeFieldType[] g81;
            org.joda.time.MutableDateTime n41;
            long long1;
            long long3;
            int integer3;
            org.joda.time.LocalDate h14;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Instant b82;
            org.joda.time.MutableInterval y41;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            g81 = a14.getFieldTypes();
            b82 = f20.toInstant();
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            n41 = new org.joda.time.MutableDateTime(long3, g32);
            p78.hashCode();
        }

        /*
         *Testcase Number:464
        */        @Test
        public void TestJunit464() {
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.Seconds z17;
            org.joda.time.Weeks r40;
            org.joda.time.Duration u15;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int j57;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            z17 = r40.toStandardSeconds();
            u15 = r40.toStandardDuration();
            d8.hashCode();
        }

        /*
         *Testcase Number:465
        */        @Test
        public void TestJunit465() {
            org.joda.time.LocalDate h14;
            org.joda.time.Partial p78;
            org.joda.time.Seconds v44;
            org.joda.time.Chronology g32;
            org.joda.time.LocalTime p68;
            int[] x81;
            org.joda.time.MutableDateTime r7;
            long long3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMinuteOfDay(integer5);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            p68 = org.joda.time.LocalTime.fromMillisOfDay(long3, g32);
            v44 = org.joda.time.Seconds.seconds(integer5);
            h14.equals(h14);
        }

        /*
         *Testcase Number:466
        */        @Test
        public void TestJunit466() {
            org.joda.time.PeriodType t52;
            t52 = org.joda.time.PeriodType.millis();
            t52.equals(t52);
        }

        /*
         *Testcase Number:467
        */        @Test
        public void TestJunit467() {
            org.joda.time.LocalDate h14;
            org.joda.time.LocalDate n2;
            org.joda.time.DateTimeComparator p47;
            org.joda.time.DateTimeComparator b73;
            org.joda.time.DateTimeComparator z53;
            org.joda.time.Partial p78;
            org.joda.time.Partial a4;
            org.joda.time.Chronology g32;
            org.joda.time.DateTimeFieldType w20;
            int[] x81;
            org.joda.time.LocalDateTime y2;
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            b73 = org.joda.time.DateTimeComparator.getInstance(w20, w20);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            a4 = p78.without(w20);
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            b73 = org.joda.time.DateTimeComparator.getInstance(w20, w20);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            a4 = p78.without(w20);
            z53 = org.joda.time.DateTimeComparator.getInstance(w20, w20);
            y2 = new org.joda.time.LocalDateTime(g32);
            n2 = y2.toLocalDate();
            h14.hashCode();
        }

        /*
         *Testcase Number:468
        */        @Test
        public void TestJunit468() {
            org.joda.time.LocalDate m98;
            org.joda.time.Years g96;
            org.joda.time.Duration l13;
            org.joda.time.LocalTime e47;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType p15;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            m98 = new org.joda.time.LocalDate(long3);
            e47 = new org.joda.time.LocalTime(long3);
            m98.toString();
        }

        /*
         *Testcase Number:469
        */        @Test
        public void TestJunit469() {
            org.joda.time.Partial p78;
            org.joda.time.Period z6;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.Chronology g32;
            int[] x81;
            org.joda.time.MutablePeriod l42;
            org.joda.time.IllegalInstantException c84;
            org.joda.time.IllegalInstantException f91;
            org.joda.time.IllegalFieldValueException e52;
            org.joda.time.LocalDateTime c66;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType l23;
            org.joda.time.PeriodType d44;
            long long1;
            long long3;
            long p16;
            int integer3;
            org.joda.time.LocalDate h14;
            org.joda.time.DateTimeComparator p47;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.DateTimeFieldType w20;
            java.lang.Object d96;
            java.lang.String a43;
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            f91 = new org.joda.time.IllegalInstantException(a43);
            e52 = new org.joda.time.IllegalFieldValueException(w20, a43);
            l23 = p15.withWeeksRemoved();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            d96 = l42.clone();
            d44 = org.joda.time.PeriodType.dayTime();
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            z6 = new org.joda.time.Period(d96, d44, g32);
            p16 = y79.getStandardSeconds();
            c66 = h14.toLocalDateTime(e6);
            p78.toString();
        }

        /*
         *Testcase Number:470
        */        @Test
        public void TestJunit470() {
            org.joda.time.Period s57;
            boolean j46;
            org.joda.time.Years g96;
            org.joda.time.Duration l13;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType f70;
            org.joda.time.PeriodType s73;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            long l24;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int y42;
            int n48;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            l24 = l13.getStandardSeconds();
            y42 = g96.getYears();
            n48 = g96.getYears();
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            l24 = l13.getStandardSeconds();
            f70 = p15.withMillisRemoved();
            s57 = org.joda.time.Period.minutes(integer1);
            s73 = g96.getPeriodType();
            j46 = g96.isGreaterThan(g96);
            s57.toString();
        }

        /*
         *Testcase Number:471
        */        @Test
        public void TestJunit471() {
            org.joda.time.Period m38;
            org.joda.time.Period j67;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration d58;
            org.joda.time.LocalTime e6;
            org.joda.time.YearMonth i66;
            org.joda.time.YearMonth a14;
            long long1;
            long long3;
            int integer3;
            int g59;
            int e27;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            a14 = i66.minusYears(integer3);
            g59 = e6.getSecondOfMinute();
            e27 = e6.getSecondOfMinute();
            long3 = 10;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            d58 = b98.multipliedBy(long3);
            j67 = m38.withMinutes(integer3);
            m38.equals(m38);
        }

        /*
         *Testcase Number:472
        */        @Test
        public void TestJunit472() {
            org.joda.time.LocalDate h14;
            org.joda.time.DateTimeComparator p47;
            org.joda.time.DateTimeComparator b73;
            org.joda.time.Partial p78;
            org.joda.time.Partial a4;
            org.joda.time.Chronology g32;
            org.joda.time.DateTimeFieldType w20;
            org.joda.time.DateTimeFieldType v91;
            int[] x81;
            org.joda.time.MutableDateTime x54;
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            b73 = org.joda.time.DateTimeComparator.getInstance(w20, w20);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            a4 = p78.without(w20);
            x54 = new org.joda.time.MutableDateTime(g32);
            v91 = p47.getUpperLimit();
            h14.equals(h14);
        }

        /*
         *Testcase Number:473
        */        @Test
        public void TestJunit473() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            java.lang.Object d96;
            org.joda.time.MutablePeriod l42;
            long long1;
            long long3;
            int integer3;
            int c48;
            int k4;
            int n21;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            d96 = l42.clone();
            c48 = e6.getMillisOfSecond();
            k4 = e6.getSecondOfMinute();
            n21 = e6.getHourOfDay();
            assertTrue(z86.equals(z86));
        }

        /*
         *Testcase Number:474
        */        @Test
        public void TestJunit474() {
            org.joda.time.Partial p78;
            org.joda.time.Period c6;
            org.joda.time.Period i41;
            org.joda.time.Chronology g32;
            int[] x81;
            org.joda.time.MutableDateTime r7;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            int m34;
            long long1;
            integer4 = 4;
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            c6 = new org.joda.time.Period(long1, g32);
            i41 = c6.withDays(integer4);
            m34 = c6.getMonths();
            p78.equals(p78);
        }

        /*
         *Testcase Number:475
        */        @Test
        public void TestJunit475() {
            org.joda.time.Partial p78;
            org.joda.time.Period c6;
            org.joda.time.Period i41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.YearMonth i66;
            org.joda.time.DateTime e69;
            org.joda.time.Chronology g32;
            org.joda.time.MonthDay d81;
            int[] x81;
            org.joda.time.MutablePeriod l42;
            org.joda.time.MutablePeriod x96;
            org.joda.time.MutablePeriod o57;
            org.joda.time.PeriodType h34;
            org.joda.time.PeriodType y57;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            long long2;
            int integer3;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            java.lang.Object n18;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            n18 = l42.clone();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMonthOfYear(integer3);
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            d81 = new org.joda.time.MonthDay(long2);
            h34 = org.joda.time.PeriodType.millis();
            x96 = new org.joda.time.MutablePeriod(long3, long2, h34);
            y57 = h34.withMinutesRemoved();
            integer4 = 4;
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            c6 = new org.joda.time.Period(long1, g32);
            i41 = c6.withDays(integer4);
            o57 = new org.joda.time.MutablePeriod(n18, y57, g32);
            assertTrue(p78.equals(p78));
        }

        /*
         *Testcase Number:476
        */        @Test
        public void TestJunit476() {
            org.joda.time.Duration l13;
            org.joda.time.YearMonth h71;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType p15;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            h71 = new org.joda.time.YearMonth(long3);
            assertTrue(l13.equals(l13));
        }

        /*
         *Testcase Number:477
        */        @Test
        public void TestJunit477() {
            org.joda.time.DateTimeComparator t4;
            org.joda.time.DateTimeFieldType k13;
            t4 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            k13 = t4.getLowerLimit();
            t4.hashCode();
        }

        /*
         *Testcase Number:478
        */        @Test
        public void TestJunit478() {
            org.joda.time.LocalDate z96;
            org.joda.time.DateTime e69;
            org.joda.time.DateTime k73;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.MutablePeriod g78;
            org.joda.time.LocalDateTime p73;
            org.joda.time.PeriodType w78;
            long long2;
            long long3;
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            y41.setDurationBeforeEnd(long2);
            k73 = e69.withEarlierOffsetAtOverlap();
            p73 = new org.joda.time.LocalDateTime(long3);
            z96 = p73.toLocalDate();
            assertTrue(z96.equals(z96));
        }

        /*
         *Testcase Number:479
        */        @Test
        public void TestJunit479() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.MutableInterval u84;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.LocalTime s86;
            java.lang.Object d96;
            org.joda.time.MutablePeriod l42;
            org.joda.time.MutablePeriod k96;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            d96 = l42.clone();
            k96 = l42.copy();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            s86 = new org.joda.time.LocalTime(long3);
            u84 = new org.joda.time.MutableInterval(long1, long3);
            assertTrue(z86.equals(z86));
        }

        /*
         *Testcase Number:480
        */        @Test
        public void TestJunit480() {
            org.joda.time.DateTime e69;
            org.joda.time.DateTime k73;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration n71;
            org.joda.time.MutablePeriod g78;
            org.joda.time.LocalDateTime p73;
            org.joda.time.PeriodType w78;
            long long2;
            long long3;
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            y41.setDurationBeforeEnd(long2);
            k73 = e69.withEarlierOffsetAtOverlap();
            p73 = new org.joda.time.LocalDateTime(long3);
            n71 = org.joda.time.Duration.standardMinutes(long3);
            e69.hashCode();
        }

        /*
         *Testcase Number:481
        */        @Test
        public void TestJunit481() {
            org.joda.time.Period m38;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Instant e28;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration d58;
            org.joda.time.LocalTime e6;
            org.joda.time.MutablePeriod c54;
            org.joda.time.MutablePeriod l42;
            org.joda.time.PeriodType y44;
            org.joda.time.PeriodType m3;
            long long1;
            long long3;
            int integer3;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            d58 = b98.multipliedBy(long3);
            e28 = z86.withMillis(long3);
            long3 = 10;
            y44 = org.joda.time.PeriodType.yearWeekDay();
            c54 = new org.joda.time.MutablePeriod(long3, long3, y44);
            m3 = y44.withMinutesRemoved();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            l42.setDays(integer3);
            m38.equals(m38);
        }

        /*
         *Testcase Number:482
        */        @Test
        public void TestJunit482() {
            org.joda.time.Duration l13;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.MutableInterval y41;
            org.joda.time.DateTime e69;
            org.joda.time.MutablePeriod g78;
            org.joda.time.MutablePeriod z22;
            org.joda.time.PeriodType w78;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            long n72;
            long long2;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            n72 = org.joda.time.DateTimeUtils.toJulianDayNumber(long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            y41.setDurationBeforeEnd(long2);
            g78.add(long3);
            z22 = g78.copy();
            g78.add(long1);
            l13.hashCode();
        }

        /*
         *Testcase Number:483
        */        @Test
        public void TestJunit483() {
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.MutablePeriod l42;
            org.joda.time.IllegalInstantException c84;
            org.joda.time.IllegalInstantException f91;
            org.joda.time.IllegalFieldValueException e52;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType l23;
            long long1;
            long long3;
            int integer3;
            org.joda.time.DateTimeComparator p47;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.DurationFieldType i56;
            org.joda.time.MutableInterval y41;
            org.joda.time.DateTimeFieldType w20;
            java.lang.String a43;
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            f91 = new org.joda.time.IllegalInstantException(a43);
            e52 = new org.joda.time.IllegalFieldValueException(w20, a43);
            l23 = p15.withWeeksRemoved();
            i56 = e52.getDurationFieldType();
            y79.equals(y79);
        }

        /*
         *Testcase Number:484
        */        @Test
        public void TestJunit484() {
            org.joda.time.Period m38;
            org.joda.time.Period y94;
            org.joda.time.Period r5;
            org.joda.time.Period p94;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration d58;
            org.joda.time.Duration f4;
            org.joda.time.Duration s32;
            org.joda.time.Duration t19;
            org.joda.time.LocalTime e6;
            org.joda.time.MutablePeriod c54;
            org.joda.time.MutablePeriod c39;
            org.joda.time.MutablePeriod g78;
            org.joda.time.MutablePeriod l42;
            org.joda.time.IllegalInstantException c84;
            org.joda.time.IllegalInstantException f91;
            org.joda.time.IllegalFieldValueException e52;
            org.joda.time.PeriodType y44;
            org.joda.time.PeriodType w78;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType l23;
            org.joda.time.PeriodType c51;
            org.joda.time.MutableDateTime r7;
            org.joda.time.MutableDateTime n62;
            long long1;
            long long3;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int h37;
            org.joda.time.DateTimeComparator p47;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Instant e28;
            org.joda.time.MutableInterval y41;
            org.joda.time.MutableInterval y75;
            org.joda.time.DateTimeFieldType w20;
            java.lang.String a43;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            d58 = b98.multipliedBy(long3);
            e28 = z86.withMillis(long3);
            long3 = 10;
            y44 = org.joda.time.PeriodType.yearWeekDay();
            c54 = new org.joda.time.MutablePeriod(long3, long3, y44);
            c39 = new org.joda.time.MutablePeriod(long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            f4 = org.joda.time.Duration.standardDays(long3);
            s32 = f4.multipliedBy(long3);
            t19 = org.joda.time.Duration.standardMinutes(long3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            r5 = y94.withMinutes(integer3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            p94 = org.joda.time.Period.minutes(integer3);
            p47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
            w20 = p47.getUpperLimit();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            f91 = new org.joda.time.IllegalInstantException(a43);
            e52 = new org.joda.time.IllegalFieldValueException(w20, a43);
            l23 = p15.withWeeksRemoved();
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setMinuteOfDay(integer2);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            f91 = new org.joda.time.IllegalInstantException(a43);
            c51 = p15.withSecondsRemoved();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            f91 = new org.joda.time.IllegalInstantException(a43);
            c51 = p15.withSecondsRemoved();
            h37 = e6.getMillisOfSecond();
            n62 = new org.joda.time.MutableDateTime(integer3, integer3, integer3, integer3, integer5, integer3, h37);
            assertTrue(m38.equals(m38));
        }

        /*
         *Testcase Number:485
        */        @Test
        public void TestJunit485() {
            org.joda.time.Period m38;
            org.joda.time.Years g96;
            org.joda.time.Years x51;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration l13;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType p15;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            long l24;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int y42;
            int n48;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            l24 = l13.getStandardSeconds();
            y42 = g96.getYears();
            n48 = g96.getYears();
            x51 = g96.dividedBy(integer3);
            m38.hashCode();
        }

        /*
         *Testcase Number:486
        */        @Test
        public void TestJunit486() {
            org.joda.time.Period y94;
            org.joda.time.Period g38;
            org.joda.time.Period u94;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration j85;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            org.joda.time.MutableDateTime r7;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long long3;
            integer3 = 6;
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            integer5 = 2;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            g38 = y94.withDays(integer5);
            u94 = g38.withYears(integer2);
            j85 = org.joda.time.Duration.standardHours(long3);
            r7.setMillisOfSecond(integer3);
            y94.hashCode();
        }

        /*
         *Testcase Number:487
        */        @Test
        public void TestJunit487() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            java.lang.Object d96;
            org.joda.time.MutablePeriod l42;
            org.joda.time.MutableDateTime p37;
            long long1;
            long long3;
            int integer3;
            int c48;
            int k4;
            int n21;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            d96 = l42.clone();
            c48 = e6.getMillisOfSecond();
            k4 = e6.getSecondOfMinute();
            n21 = e6.getHourOfDay();
            p37 = z86.toMutableDateTime();
            z86.hashCode();
        }

        /*
         *Testcase Number:488
        */        @Test
        public void TestJunit488() {
            org.joda.time.Partial p78;
            org.joda.time.Period y94;
            org.joda.time.Period g38;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration f4;
            org.joda.time.Chronology g32;
            org.joda.time.YearMonth x86;
            org.joda.time.LocalTime x83;
            org.joda.time.LocalTime e6;
            int[] x81;
            org.joda.time.MutablePeriod k48;
            org.joda.time.MutablePeriod g78;
            org.joda.time.MutablePeriod k11;
            org.joda.time.MutablePeriod l42;
            org.joda.time.IllegalInstantException c84;
            org.joda.time.IllegalInstantException f91;
            org.joda.time.PeriodType w78;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType c51;
            org.joda.time.MutableDateTime z18;
            long long3;
            long long1;
            int integer4;
            int integer3;
            int c30;
            int integer5;
            int t39;
            org.joda.time.LocalDate h14;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            java.lang.String a43;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            integer4 = 4;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            f4 = org.joda.time.Duration.standardMinutes(long3);
            x83 = new org.joda.time.LocalTime(integer4, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            k48 = new org.joda.time.MutablePeriod(long3, long3, g32);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            c30 = e6.getMillisOfDay();
            org.joda.time.DateTimeUtils.setCurrentMillisOffset(long3);
            integer5 = 2;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            g38 = y94.withDays(integer5);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            k11 = new org.joda.time.MutablePeriod(long3, w78, g32);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            c84 = new org.joda.time.IllegalInstantException(long3, a43);
            f91 = new org.joda.time.IllegalInstantException(a43);
            c51 = p15.withSecondsRemoved();
            t39 = e6.getMillisOfSecond();
            z18 = new org.joda.time.MutableDateTime(long3);
            l42.setPeriod(long3, g32);
            p78.equals(p78);
        }

        /*
         *Testcase Number:489
        */        @Test
        public void TestJunit489() {
            org.joda.time.Period m38;
            org.joda.time.Period p19;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.Instant g30;
            org.joda.time.Instant c6;
            org.joda.time.MutableInterval y41;
            org.joda.time.MutableInterval y75;
            org.joda.time.LocalTime e6;
            org.joda.time.LocalTime h68;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration d58;
            org.joda.time.Duration v85;
            org.joda.time.Duration f4;
            org.joda.time.DateTime e69;
            org.joda.time.DateTime y20;
            org.joda.time.MonthDay b46;
            org.joda.time.MutablePeriod g78;
            org.joda.time.MutablePeriod c21;
            org.joda.time.PeriodType w78;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            long long2;
            long l25;
            int c30;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            c30 = e6.getMillisOfDay();
            long3 = 10;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            d58 = b98.multipliedBy(long3);
            p19 = m38.withMonths(c30);
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            y41.setDurationBeforeEnd(long2);
            v85 = org.joda.time.Duration.millis(long3);
            y20 = e69.withTime(e6);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMinuteOfDay(integer5);
            b46 = new org.joda.time.MonthDay(long3);
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            f4 = org.joda.time.Duration.standardDays(long3);
            l25 = f4.getStandardSeconds();
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            h68 = new org.joda.time.LocalTime(long3);
            g30 = org.joda.time.Instant.ofEpochSecond(long3);
            c6 = g30.withMillis(long1);
            c21 = new org.joda.time.MutablePeriod(long3, long3, w78);
            m38.equals(m38);
        }

        /*
         *Testcase Number:490
        */        @Test
        public void TestJunit490() {
            org.joda.time.LocalDate v72;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.YearMonth i66;
            org.joda.time.DateTime e69;
            org.joda.time.MonthDay d81;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            long long2;
            int integer3;
            int integer4;
            int integer5;
            int integer2;
            int integer1;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMillisOfDay(integer3);
            long2 = 6;
            e69 = new org.joda.time.DateTime(long2);
            d81 = new org.joda.time.MonthDay(long2);
            org.joda.time.DateTimeUtils.setCurrentMillisFixed(long2);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            i66 = new org.joda.time.YearMonth(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMonthOfYear(integer3);
            r7.setMillis(long2);
            v72 = i66.toLocalDate(integer4);
            assertTrue(v72.equals(v72));
        }

        /*
         *Testcase Number:491
        */        @Test
        public void TestJunit491() {
            org.joda.time.Partial p78;
            org.joda.time.Period y94;
            org.joda.time.Period r5;
            org.joda.time.Duration l13;
            org.joda.time.Duration s25;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration f4;
            org.joda.time.Duration s32;
            org.joda.time.Duration t19;
            org.joda.time.Chronology g32;
            org.joda.time.DateTime b42;
            int[] x81;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.LocalDateTime h87;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType f70;
            org.joda.time.PeriodType i68;
            org.joda.time.PeriodType w78;
            org.joda.time.MutableDateTime r7;
            org.joda.time.MutableDateTime c14;
            long long3;
            long long1;
            long e8;
            long l24;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int integer3;
            org.joda.time.Years g96;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.MutableInterval y75;
            java.lang.String a43;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            s25 = l13.toDuration();
            e8 = org.joda.time.DateTimeUtils.toJulianDayNumber(long3);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            l24 = l13.getStandardSeconds();
            f70 = p15.withMillisRemoved();
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            r7.setMillisOfDay(integer3);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            i68 = g96.getPeriodType();
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h87 = new org.joda.time.LocalDateTime(long1, g32);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            f4 = org.joda.time.Duration.standardDays(long3);
            s32 = f4.multipliedBy(long3);
            t19 = org.joda.time.Duration.standardMinutes(long3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            r5 = y94.withMinutes(integer3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long1 = 7;
            long3 = 10;
            y75 = new org.joda.time.MutableInterval(long1, long3);
            f4 = org.joda.time.Duration.standardDays(long3);
            s32 = f4.multipliedBy(long3);
            c14 = new org.joda.time.MutableDateTime(long1);
            b42 = new org.joda.time.DateTime(integer4, integer2, integer1, integer5, integer3, integer3);
            assertTrue(p78.equals(p78));
        }

        /*
         *Testcase Number:492
        */        @Test
        public void TestJunit492() {
            org.joda.time.LocalDate h14;
            org.joda.time.Partial p78;
            org.joda.time.Duration x89;
            org.joda.time.Chronology g32;
            org.joda.time.LocalTime p68;
            int[] x81;
            org.joda.time.MutableDateTime r7;
            long long3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMinuteOfDay(integer5);
            x89 = org.joda.time.Duration.standardDays(long3);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            integer4 = 4;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setWeekyear(integer4);
            r7.setMinuteOfDay(integer5);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            p68 = org.joda.time.LocalTime.fromMillisOfDay(long3, g32);
            r7.setSecondOfMinute(integer5);
            h14.toString();
        }

        /*
         *Testcase Number:493
        */        @Test
        public void TestJunit493() {
            org.joda.time.Period y94;
            org.joda.time.Period g38;
            org.joda.time.Partial p78;
            org.joda.time.LocalTime e6;
            org.joda.time.Duration y79;
            org.joda.time.Chronology g32;
            org.joda.time.YearMonth x86;
            int[] x81;
            org.joda.time.MutablePeriod g78;
            org.joda.time.MutablePeriod k11;
            org.joda.time.PeriodType w78;
            long long3;
            int c30;
            int integer5;
            org.joda.time.LocalDate h14;
            org.joda.time.LocalDate e92;
            org.joda.time.MutableInterval y41;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            c30 = e6.getMillisOfDay();
            org.joda.time.DateTimeUtils.setCurrentMillisOffset(long3);
            integer5 = 2;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            g38 = y94.withDays(integer5);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            p78 = new org.joda.time.Partial();
            x81 = p78.getValues();
            g32 = p78.getChronology();
            h14 = new org.joda.time.LocalDate(g32);
            x86 = new org.joda.time.YearMonth(long3, g32);
            k11 = new org.joda.time.MutablePeriod(long3, w78, g32);
            e92 = new org.joda.time.LocalDate(g32);
            assertTrue(y94.equals(y94));
        }

        /*
         *Testcase Number:494
        */        @Test
        public void TestJunit494() {
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.Weeks r40;
            org.joda.time.Hours f30;
            org.joda.time.MutableDateTime r7;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int v70;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            f30 = r40.toStandardHours();
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            v70 = d8.getSeconds();
            r7.setMinuteOfDay(integer2);
            assertTrue(d8.equals(d8));
        }

        /*
         *Testcase Number:495
        */        @Test
        public void TestJunit495() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            java.lang.Object n18;
            org.joda.time.MutablePeriod l42;
            long long1;
            long long3;
            int integer3;
            int o45;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            n18 = l42.clone();
            o45 = e6.getMillisOfSecond();
            z86.hashCode();
        }

        /*
         *Testcase Number:496
        */        @Test
        public void TestJunit496() {
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.LocalTime m56;
            java.lang.Object n18;
            org.joda.time.MutablePeriod l42;
            long long1;
            long long3;
            int integer3;
            int o45;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            n18 = l42.clone();
            o45 = e6.getMillisOfSecond();
            m56 = org.joda.time.LocalTime.fromMillisOfDay(long1);
            z86.toString();
        }

        /*
         *Testcase Number:497
        */        @Test
        public void TestJunit497() {
            org.joda.time.Period s37;
            org.joda.time.Period i27;
            org.joda.time.Weeks r40;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.MutablePeriod l42;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int j57;
            boolean g70;
            org.joda.time.Seconds d8;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Days w33;
            java.lang.Object d96;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            d96 = l42.clone();
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            d8 = org.joda.time.Seconds.seconds(integer5);
            g70 = d8.isGreaterThan(d8);
            r40 = d8.toStandardWeeks();
            j57 = d8.getSeconds();
            s37 = org.joda.time.Period.days(integer2);
            w33 = r40.toStandardDays();
            i27 = s37.withMinutes(integer3);
            assertTrue(s37.equals(s37));
        }

        /*
         *Testcase Number:498
        */        @Test
        public void TestJunit498() {
            org.joda.time.Period m38;
            org.joda.time.Period m70;
            org.joda.time.Period j2;
            org.joda.time.Period l77;
            org.joda.time.Period m39;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.LocalTime e6;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            m38 = org.joda.time.Period.hours(integer3);
            m70 = m38.normalizedStandard();
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            j2 = org.joda.time.Period.months(integer4);
            l77 = j2.withSeconds(integer3);
            m39 = j2.plusHours(integer3);
            m38.toString();
        }

        /*
         *Testcase Number:499
        */        @Test
        public void TestJunit499() {
            org.joda.time.Period y94;
            org.joda.time.Period g38;
            org.joda.time.Period u94;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration f4;
            org.joda.time.LocalTime x83;
            org.joda.time.MonthDay r10;
            org.joda.time.MutablePeriod g78;
            org.joda.time.PeriodType w78;
            org.joda.time.MutableDateTime r7;
            int integer3;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            long long3;
            long long1;
            integer3 = 6;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setMonthOfYear(integer3);
            integer5 = 2;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            w78 = org.joda.time.PeriodType.yearDay();
            g78 = new org.joda.time.MutablePeriod(long3, w78);
            g78.add(long3);
            y94 = new org.joda.time.Period(long3);
            g38 = y94.withDays(integer5);
            u94 = g38.withYears(integer2);
            integer4 = 4;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            f4 = org.joda.time.Duration.standardMinutes(long3);
            x83 = new org.joda.time.LocalTime(integer4, integer3);
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            r7.setWeekOfWeekyear(integer3);
            r10 = new org.joda.time.MonthDay(integer4, integer4);
            y94.toString();
        }

        /*
         *Testcase Number:500
        */        @Test
        public void TestJunit500() {
            boolean c33;
            org.joda.time.Years g96;
            org.joda.time.Duration l13;
            java.lang.String a43;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType p15;
            org.joda.time.PeriodType f70;
            org.joda.time.MutableDateTime r7;
            long long3;
            long long1;
            long l24;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            int y42;
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            l24 = l13.getStandardSeconds();
            f70 = p15.withMillisRemoved();
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            l24 = l13.getStandardSeconds();
            y42 = g96.getYears();
            c33 = g96.isGreaterThan(g96);
            g96.hashCode();
        }

        /*
         *Testcase Number:501
        */        @Test
        public void TestJunit501() {
            org.joda.time.Duration y79;
            org.joda.time.Duration b98;
            org.joda.time.Duration l13;
            org.joda.time.LocalTime e6;
            org.joda.time.LocalTime e47;
            org.joda.time.MutablePeriod l42;
            org.joda.time.IllegalInstantException s12;
            org.joda.time.PeriodType p15;
            org.joda.time.MutableDateTime r7;
            long long1;
            long long3;
            int integer3;
            int o45;
            int integer5;
            int integer2;
            int integer1;
            int integer4;
            org.joda.time.LocalDate m98;
            org.joda.time.Years g96;
            org.joda.time.Years n73;
            org.joda.time.Instant z86;
            org.joda.time.Instant f20;
            org.joda.time.MutableInterval y41;
            java.lang.Object n18;
            java.lang.String a43;
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            long1 = 7;
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            y79 = new org.joda.time.Duration(long3);
            b98 = y79.dividedBy(long1);
            integer3 = 6;
            long3 = 10;
            z86 = org.joda.time.Instant.ofEpochMilli(long3);
            f20 = z86.withDurationAdded(long3, integer3);
            long3 = 10;
            long3 = 10;
            y41 = new org.joda.time.MutableInterval(long3, long3);
            e6 = new org.joda.time.LocalTime(long3);
            y41.setInterval(long1, long3);
            l42 = new org.joda.time.MutablePeriod(long3);
            n18 = l42.clone();
            o45 = e6.getMillisOfSecond();
            long3 = 10;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long3);
            long1 = 7;
            integer5 = 2;
            integer5 = 2;
            integer5 = 2;
            integer2 = 10;
            integer1 = 8;
            integer4 = 4;
            integer4 = 4;
            r7 = new org.joda.time.MutableDateTime(integer5, integer5, integer5, integer2, integer1, integer4, integer4);
            r7.setTime(long1);
            r7.setSecondOfMinute(integer4);
            l13 = org.joda.time.Duration.millis(long1);
            p15 = org.joda.time.PeriodType.yearMonthDay();
            a43 = p15.getName();
            s12 = new org.joda.time.IllegalInstantException(long1, a43);
            g96 = org.joda.time.Years.years(integer1);
            m98 = new org.joda.time.LocalDate(long3);
            e47 = new org.joda.time.LocalTime(long3);
            n73 = g96.multipliedBy(integer3);
            y79.equals(y79);
        }


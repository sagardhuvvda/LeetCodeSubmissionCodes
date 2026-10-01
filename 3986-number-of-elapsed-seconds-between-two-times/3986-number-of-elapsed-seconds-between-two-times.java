import java.time.Duration;
import java.time.LocalTime;
import java.util.*;
class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        LocalTime t1 = LocalTime.parse(startTime);
        LocalTime t2 = LocalTime.parse(endTime);
        Duration d = Duration.between(t1,t2);
        long Seconds = d.getSeconds();
        return (int)Seconds;
    }
}
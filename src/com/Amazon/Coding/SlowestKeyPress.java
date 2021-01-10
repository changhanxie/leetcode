package com.Amazon.Coding;

public class SlowestKeyPress {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int maxDuration = releaseTimes[0];
        char targetKey = keysPressed.charAt(0);
        for(int i = 1; i < releaseTimes.length; i++){
            //Return the key of the keypress that had the longest duration. If there are multiple such keypresses, return the lexicographically largest key of the keypresses.
            if(releaseTimes[i] - releaseTimes[i-1] == maxDuration && targetKey < keysPressed.charAt(i)){
                targetKey = keysPressed.charAt(i);
            }
            else if(releaseTimes[i] - releaseTimes[i-1] > maxDuration){
                maxDuration = releaseTimes[i] - releaseTimes[i-1];
                targetKey = keysPressed.charAt(i);
            }
        }

        return targetKey;
    }
}

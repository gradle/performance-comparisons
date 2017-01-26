package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_378 {
    private final Production83_378 production = new Production83_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
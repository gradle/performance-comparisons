package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_378 {
    private final Production98_378 production = new Production98_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_378 {
    private final Production35_378 production = new Production35_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
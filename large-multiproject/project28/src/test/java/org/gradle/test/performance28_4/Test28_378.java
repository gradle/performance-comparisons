package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_378 {
    private final Production28_378 production = new Production28_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_378 {
    private final Production13_378 production = new Production13_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
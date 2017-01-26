package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_378 {
    private final Production6_378 production = new Production6_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
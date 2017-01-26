package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_378 {
    private final Production41_378 production = new Production41_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
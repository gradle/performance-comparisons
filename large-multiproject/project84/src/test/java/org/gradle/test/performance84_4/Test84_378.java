package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_378 {
    private final Production84_378 production = new Production84_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
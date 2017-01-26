package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_378 {
    private final Production25_378 production = new Production25_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
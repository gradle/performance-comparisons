package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_378 {
    private final Production80_378 production = new Production80_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
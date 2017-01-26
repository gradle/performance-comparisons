package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_378 {
    private final Production31_378 production = new Production31_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
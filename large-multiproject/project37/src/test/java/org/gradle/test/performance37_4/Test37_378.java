package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_378 {
    private final Production37_378 production = new Production37_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
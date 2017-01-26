package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_378 {
    private final Production20_378 production = new Production20_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
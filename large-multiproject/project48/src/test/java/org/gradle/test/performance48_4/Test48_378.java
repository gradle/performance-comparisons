package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_378 {
    private final Production48_378 production = new Production48_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
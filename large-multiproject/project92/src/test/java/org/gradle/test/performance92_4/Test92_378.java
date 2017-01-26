package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_378 {
    private final Production92_378 production = new Production92_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
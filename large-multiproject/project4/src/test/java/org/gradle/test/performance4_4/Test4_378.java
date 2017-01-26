package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_378 {
    private final Production4_378 production = new Production4_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
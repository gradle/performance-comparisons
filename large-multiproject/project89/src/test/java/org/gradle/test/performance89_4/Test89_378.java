package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_378 {
    private final Production89_378 production = new Production89_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_378 {
    private final Production47_378 production = new Production47_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
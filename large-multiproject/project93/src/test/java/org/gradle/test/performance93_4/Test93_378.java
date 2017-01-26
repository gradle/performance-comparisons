package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_378 {
    private final Production93_378 production = new Production93_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
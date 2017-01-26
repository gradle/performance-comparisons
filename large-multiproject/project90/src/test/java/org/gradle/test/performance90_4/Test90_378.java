package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_378 {
    private final Production90_378 production = new Production90_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_378 {
    private final Production67_378 production = new Production67_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
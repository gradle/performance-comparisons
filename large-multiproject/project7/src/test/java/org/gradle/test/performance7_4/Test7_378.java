package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_378 {
    private final Production7_378 production = new Production7_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
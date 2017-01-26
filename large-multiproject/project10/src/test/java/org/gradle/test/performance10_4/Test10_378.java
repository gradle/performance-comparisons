package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_378 {
    private final Production10_378 production = new Production10_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
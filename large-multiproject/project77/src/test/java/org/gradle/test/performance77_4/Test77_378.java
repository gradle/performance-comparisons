package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_378 {
    private final Production77_378 production = new Production77_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_378 {
    private final Production79_378 production = new Production79_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
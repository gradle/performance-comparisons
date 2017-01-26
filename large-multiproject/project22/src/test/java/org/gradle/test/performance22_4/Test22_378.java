package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_378 {
    private final Production22_378 production = new Production22_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
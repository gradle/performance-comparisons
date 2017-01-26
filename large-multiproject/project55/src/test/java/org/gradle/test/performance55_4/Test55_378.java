package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_378 {
    private final Production55_378 production = new Production55_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
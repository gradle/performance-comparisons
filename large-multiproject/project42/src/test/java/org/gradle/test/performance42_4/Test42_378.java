package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_378 {
    private final Production42_378 production = new Production42_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
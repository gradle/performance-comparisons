package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_378 {
    private final Production49_378 production = new Production49_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
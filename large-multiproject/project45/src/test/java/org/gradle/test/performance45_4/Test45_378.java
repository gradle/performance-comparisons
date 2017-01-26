package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_378 {
    private final Production45_378 production = new Production45_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
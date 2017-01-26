package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_378 {
    private final Production44_378 production = new Production44_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_378 {
    private final Production18_378 production = new Production18_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
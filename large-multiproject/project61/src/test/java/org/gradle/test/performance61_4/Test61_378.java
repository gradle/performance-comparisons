package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_378 {
    private final Production61_378 production = new Production61_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
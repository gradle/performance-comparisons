package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_352 {
    private final Production15_352 production = new Production15_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
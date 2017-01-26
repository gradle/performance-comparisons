package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_352 {
    private final Production50_352 production = new Production50_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
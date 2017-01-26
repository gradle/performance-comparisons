package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_352 {
    private final Production3_352 production = new Production3_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
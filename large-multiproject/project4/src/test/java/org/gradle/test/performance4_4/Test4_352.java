package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_352 {
    private final Production4_352 production = new Production4_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
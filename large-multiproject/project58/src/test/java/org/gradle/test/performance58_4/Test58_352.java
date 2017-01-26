package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_352 {
    private final Production58_352 production = new Production58_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
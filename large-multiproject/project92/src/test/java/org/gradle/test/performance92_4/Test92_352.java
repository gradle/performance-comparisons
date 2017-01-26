package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_352 {
    private final Production92_352 production = new Production92_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
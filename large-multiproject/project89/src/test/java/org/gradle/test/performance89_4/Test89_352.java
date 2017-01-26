package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_352 {
    private final Production89_352 production = new Production89_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_352 {
    private final Production20_352 production = new Production20_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
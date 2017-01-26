package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_352 {
    private final Production5_352 production = new Production5_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
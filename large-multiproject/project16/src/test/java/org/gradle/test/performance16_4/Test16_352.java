package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_352 {
    private final Production16_352 production = new Production16_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
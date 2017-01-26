package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_346 {
    private final Production16_346 production = new Production16_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
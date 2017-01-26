package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_327 {
    private final Production16_327 production = new Production16_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
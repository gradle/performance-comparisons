package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_478 {
    private final Production16_478 production = new Production16_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
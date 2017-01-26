package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_291 {
    private final Production16_291 production = new Production16_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
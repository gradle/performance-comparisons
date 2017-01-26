package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_344 {
    private final Production16_344 production = new Production16_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
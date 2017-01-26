package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_413 {
    private final Production16_413 production = new Production16_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_370 {
    private final Production16_370 production = new Production16_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
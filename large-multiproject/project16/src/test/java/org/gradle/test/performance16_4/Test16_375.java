package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_375 {
    private final Production16_375 production = new Production16_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
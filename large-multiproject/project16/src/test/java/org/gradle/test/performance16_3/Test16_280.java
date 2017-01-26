package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_280 {
    private final Production16_280 production = new Production16_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
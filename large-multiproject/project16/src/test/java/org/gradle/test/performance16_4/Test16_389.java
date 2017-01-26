package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_389 {
    private final Production16_389 production = new Production16_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_328 {
    private final Production16_328 production = new Production16_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
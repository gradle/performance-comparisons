package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_298 {
    private final Production16_298 production = new Production16_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
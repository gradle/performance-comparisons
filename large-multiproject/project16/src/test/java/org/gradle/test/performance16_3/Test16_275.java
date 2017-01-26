package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_275 {
    private final Production16_275 production = new Production16_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
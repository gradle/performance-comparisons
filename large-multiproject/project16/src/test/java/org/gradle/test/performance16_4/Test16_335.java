package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_335 {
    private final Production16_335 production = new Production16_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
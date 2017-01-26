package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_160 {
    private final Production16_160 production = new Production16_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
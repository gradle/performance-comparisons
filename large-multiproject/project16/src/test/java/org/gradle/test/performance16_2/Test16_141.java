package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_141 {
    private final Production16_141 production = new Production16_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
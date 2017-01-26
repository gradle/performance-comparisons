package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_412 {
    private final Production16_412 production = new Production16_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
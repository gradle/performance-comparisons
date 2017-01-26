package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_240 {
    private final Production16_240 production = new Production16_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_101 {
    private final Production8_101 production = new Production8_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
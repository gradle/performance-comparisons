package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_130 {
    private final Production8_130 production = new Production8_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
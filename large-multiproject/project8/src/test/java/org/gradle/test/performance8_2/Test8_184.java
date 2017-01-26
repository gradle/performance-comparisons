package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_184 {
    private final Production8_184 production = new Production8_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
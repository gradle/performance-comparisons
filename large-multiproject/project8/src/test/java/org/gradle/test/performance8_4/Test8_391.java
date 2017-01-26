package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_391 {
    private final Production8_391 production = new Production8_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
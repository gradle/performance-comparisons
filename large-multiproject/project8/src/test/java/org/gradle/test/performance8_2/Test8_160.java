package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_160 {
    private final Production8_160 production = new Production8_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
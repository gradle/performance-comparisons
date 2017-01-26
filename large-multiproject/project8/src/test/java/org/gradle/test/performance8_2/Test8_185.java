package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_185 {
    private final Production8_185 production = new Production8_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
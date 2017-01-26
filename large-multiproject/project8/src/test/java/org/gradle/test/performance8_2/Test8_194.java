package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_194 {
    private final Production8_194 production = new Production8_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
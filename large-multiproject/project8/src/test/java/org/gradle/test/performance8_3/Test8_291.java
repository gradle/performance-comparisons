package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_291 {
    private final Production8_291 production = new Production8_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
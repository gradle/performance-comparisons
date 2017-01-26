package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_295 {
    private final Production8_295 production = new Production8_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
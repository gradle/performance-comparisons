package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_258 {
    private final Production8_258 production = new Production8_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
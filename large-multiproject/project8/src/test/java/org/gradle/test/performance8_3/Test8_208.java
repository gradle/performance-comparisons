package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_208 {
    private final Production8_208 production = new Production8_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
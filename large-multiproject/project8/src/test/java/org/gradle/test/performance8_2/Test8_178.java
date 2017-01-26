package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_178 {
    private final Production8_178 production = new Production8_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
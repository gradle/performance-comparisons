package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_192 {
    private final Production8_192 production = new Production8_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_254 {
    private final Production8_254 production = new Production8_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
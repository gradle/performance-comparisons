package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_287 {
    private final Production8_287 production = new Production8_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
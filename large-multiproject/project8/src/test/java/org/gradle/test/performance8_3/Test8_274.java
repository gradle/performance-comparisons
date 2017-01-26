package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_274 {
    private final Production8_274 production = new Production8_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
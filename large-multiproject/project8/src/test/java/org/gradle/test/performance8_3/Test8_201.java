package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_201 {
    private final Production8_201 production = new Production8_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
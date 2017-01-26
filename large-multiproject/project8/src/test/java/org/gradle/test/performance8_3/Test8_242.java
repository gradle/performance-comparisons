package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_242 {
    private final Production8_242 production = new Production8_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_133 {
    private final Production8_133 production = new Production8_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
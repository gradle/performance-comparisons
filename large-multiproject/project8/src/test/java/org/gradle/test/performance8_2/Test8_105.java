package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_105 {
    private final Production8_105 production = new Production8_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
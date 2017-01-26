package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_19 {
    private final Production8_19 production = new Production8_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
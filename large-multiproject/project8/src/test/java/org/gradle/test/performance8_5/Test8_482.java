package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_482 {
    private final Production8_482 production = new Production8_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
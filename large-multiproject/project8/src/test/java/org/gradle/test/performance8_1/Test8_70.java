package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_70 {
    private final Production8_70 production = new Production8_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_33 {
    private final Production8_33 production = new Production8_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
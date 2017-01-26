package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_18 {
    private final Production8_18 production = new Production8_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
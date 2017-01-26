package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_12 {
    private final Production8_12 production = new Production8_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
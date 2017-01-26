package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_95 {
    private final Production8_95 production = new Production8_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
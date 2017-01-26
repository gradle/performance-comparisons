package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_56 {
    private final Production8_56 production = new Production8_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
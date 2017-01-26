package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_170 {
    private final Production8_170 production = new Production8_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
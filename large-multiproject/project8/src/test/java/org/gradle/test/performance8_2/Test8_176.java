package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_176 {
    private final Production8_176 production = new Production8_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
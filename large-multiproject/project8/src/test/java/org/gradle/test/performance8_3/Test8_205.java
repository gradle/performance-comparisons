package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_205 {
    private final Production8_205 production = new Production8_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
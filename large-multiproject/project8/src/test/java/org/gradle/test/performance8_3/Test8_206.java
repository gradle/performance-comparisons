package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_206 {
    private final Production8_206 production = new Production8_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
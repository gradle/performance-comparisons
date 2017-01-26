package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_351 {
    private final Production31_351 production = new Production31_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
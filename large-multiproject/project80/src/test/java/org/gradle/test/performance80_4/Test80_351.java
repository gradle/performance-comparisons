package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_351 {
    private final Production80_351 production = new Production80_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
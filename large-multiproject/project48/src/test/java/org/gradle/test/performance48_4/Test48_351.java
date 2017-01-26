package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_351 {
    private final Production48_351 production = new Production48_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
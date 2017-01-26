package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_351 {
    private final Production58_351 production = new Production58_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
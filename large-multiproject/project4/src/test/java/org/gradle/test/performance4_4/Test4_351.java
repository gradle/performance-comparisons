package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_351 {
    private final Production4_351 production = new Production4_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
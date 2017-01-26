package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_351 {
    private final Production47_351 production = new Production47_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
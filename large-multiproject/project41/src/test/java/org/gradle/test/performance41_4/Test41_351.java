package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_351 {
    private final Production41_351 production = new Production41_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
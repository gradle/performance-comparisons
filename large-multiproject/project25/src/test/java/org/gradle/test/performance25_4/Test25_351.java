package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_351 {
    private final Production25_351 production = new Production25_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
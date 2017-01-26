package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_351 {
    private final Production30_351 production = new Production30_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
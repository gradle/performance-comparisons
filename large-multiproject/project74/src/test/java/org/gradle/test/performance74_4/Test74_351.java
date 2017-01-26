package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_351 {
    private final Production74_351 production = new Production74_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
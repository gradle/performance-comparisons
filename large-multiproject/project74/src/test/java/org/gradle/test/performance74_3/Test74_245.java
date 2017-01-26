package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_245 {
    private final Production74_245 production = new Production74_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_117 {
    private final Production74_117 production = new Production74_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
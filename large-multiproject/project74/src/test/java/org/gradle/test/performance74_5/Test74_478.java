package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_478 {
    private final Production74_478 production = new Production74_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_487 {
    private final Production74_487 production = new Production74_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_430 {
    private final Production74_430 production = new Production74_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
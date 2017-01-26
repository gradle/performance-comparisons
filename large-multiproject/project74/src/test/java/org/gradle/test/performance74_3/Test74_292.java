package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_292 {
    private final Production74_292 production = new Production74_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
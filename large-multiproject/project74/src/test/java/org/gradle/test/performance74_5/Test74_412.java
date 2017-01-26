package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_412 {
    private final Production74_412 production = new Production74_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
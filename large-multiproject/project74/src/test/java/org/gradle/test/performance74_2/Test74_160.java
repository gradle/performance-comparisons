package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_160 {
    private final Production74_160 production = new Production74_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
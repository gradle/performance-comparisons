package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_391 {
    private final Production74_391 production = new Production74_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
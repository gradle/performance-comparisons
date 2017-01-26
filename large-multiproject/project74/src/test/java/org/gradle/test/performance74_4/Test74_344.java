package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_344 {
    private final Production74_344 production = new Production74_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
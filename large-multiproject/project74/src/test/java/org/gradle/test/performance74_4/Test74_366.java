package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_366 {
    private final Production74_366 production = new Production74_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
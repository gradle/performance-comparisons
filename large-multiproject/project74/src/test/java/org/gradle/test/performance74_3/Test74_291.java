package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_291 {
    private final Production74_291 production = new Production74_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
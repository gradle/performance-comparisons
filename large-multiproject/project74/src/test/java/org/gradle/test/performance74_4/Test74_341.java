package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_341 {
    private final Production74_341 production = new Production74_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
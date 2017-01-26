package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_334 {
    private final Production74_334 production = new Production74_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
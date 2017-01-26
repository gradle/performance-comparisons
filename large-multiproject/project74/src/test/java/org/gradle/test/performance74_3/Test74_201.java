package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_201 {
    private final Production74_201 production = new Production74_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
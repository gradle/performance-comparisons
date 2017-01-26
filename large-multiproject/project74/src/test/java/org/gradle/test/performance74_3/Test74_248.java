package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_248 {
    private final Production74_248 production = new Production74_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
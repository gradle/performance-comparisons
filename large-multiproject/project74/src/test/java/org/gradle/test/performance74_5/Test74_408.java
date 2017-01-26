package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_408 {
    private final Production74_408 production = new Production74_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
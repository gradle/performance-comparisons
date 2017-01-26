package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_262 {
    private final Production74_262 production = new Production74_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
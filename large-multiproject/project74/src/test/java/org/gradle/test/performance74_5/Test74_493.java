package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_493 {
    private final Production74_493 production = new Production74_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
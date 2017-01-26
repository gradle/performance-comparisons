package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_483 {
    private final Production74_483 production = new Production74_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
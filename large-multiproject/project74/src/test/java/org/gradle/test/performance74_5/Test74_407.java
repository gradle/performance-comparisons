package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_407 {
    private final Production74_407 production = new Production74_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
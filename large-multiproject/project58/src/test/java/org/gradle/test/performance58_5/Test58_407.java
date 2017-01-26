package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_407 {
    private final Production58_407 production = new Production58_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
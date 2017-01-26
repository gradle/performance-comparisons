package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_407 {
    private final Production4_407 production = new Production4_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
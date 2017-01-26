package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_407 {
    private final Production89_407 production = new Production89_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
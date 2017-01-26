package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_407 {
    private final Production47_407 production = new Production47_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
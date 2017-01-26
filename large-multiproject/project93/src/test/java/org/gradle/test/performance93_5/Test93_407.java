package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_407 {
    private final Production93_407 production = new Production93_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_407 {
    private final Production7_407 production = new Production7_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
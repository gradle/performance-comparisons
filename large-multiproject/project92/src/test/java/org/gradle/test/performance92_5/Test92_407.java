package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_407 {
    private final Production92_407 production = new Production92_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
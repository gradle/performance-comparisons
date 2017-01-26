package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_407 {
    private final Production3_407 production = new Production3_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
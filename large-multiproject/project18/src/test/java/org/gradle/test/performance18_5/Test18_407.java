package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_407 {
    private final Production18_407 production = new Production18_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
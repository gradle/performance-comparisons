package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_117 {
    private final Production18_117 production = new Production18_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
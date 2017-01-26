package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_245 {
    private final Production18_245 production = new Production18_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
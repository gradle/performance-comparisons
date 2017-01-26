package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_262 {
    private final Production18_262 production = new Production18_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
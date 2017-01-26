package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_478 {
    private final Production18_478 production = new Production18_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
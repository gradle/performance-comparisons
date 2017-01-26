package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_451 {
    private final Production18_451 production = new Production18_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
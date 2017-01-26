package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_487 {
    private final Production18_487 production = new Production18_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
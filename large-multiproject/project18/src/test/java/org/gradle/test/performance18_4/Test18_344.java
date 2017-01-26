package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_344 {
    private final Production18_344 production = new Production18_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
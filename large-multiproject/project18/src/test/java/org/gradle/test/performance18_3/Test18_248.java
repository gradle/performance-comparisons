package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_248 {
    private final Production18_248 production = new Production18_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
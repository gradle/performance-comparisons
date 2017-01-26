package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_86 {
    private final Production18_86 production = new Production18_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
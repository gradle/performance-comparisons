package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_298 {
    private final Production18_298 production = new Production18_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
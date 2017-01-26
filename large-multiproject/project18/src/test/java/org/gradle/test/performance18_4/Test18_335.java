package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_335 {
    private final Production18_335 production = new Production18_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
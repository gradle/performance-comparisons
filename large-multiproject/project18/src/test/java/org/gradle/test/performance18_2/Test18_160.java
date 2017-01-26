package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_160 {
    private final Production18_160 production = new Production18_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
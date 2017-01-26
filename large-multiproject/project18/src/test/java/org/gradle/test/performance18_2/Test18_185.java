package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_185 {
    private final Production18_185 production = new Production18_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
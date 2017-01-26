package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_124 {
    private final Production18_124 production = new Production18_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
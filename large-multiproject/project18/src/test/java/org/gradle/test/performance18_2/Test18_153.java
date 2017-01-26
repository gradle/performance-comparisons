package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_153 {
    private final Production18_153 production = new Production18_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
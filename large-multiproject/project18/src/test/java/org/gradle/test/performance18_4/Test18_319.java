package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_319 {
    private final Production18_319 production = new Production18_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
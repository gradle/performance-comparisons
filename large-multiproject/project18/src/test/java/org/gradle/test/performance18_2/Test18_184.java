package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_184 {
    private final Production18_184 production = new Production18_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
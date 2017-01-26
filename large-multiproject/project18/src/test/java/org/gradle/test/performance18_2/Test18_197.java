package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_197 {
    private final Production18_197 production = new Production18_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
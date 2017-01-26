package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_130 {
    private final Production18_130 production = new Production18_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
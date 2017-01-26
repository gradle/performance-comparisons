package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_101 {
    private final Production18_101 production = new Production18_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
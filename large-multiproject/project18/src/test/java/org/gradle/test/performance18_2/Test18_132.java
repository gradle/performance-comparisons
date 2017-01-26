package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_132 {
    private final Production18_132 production = new Production18_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
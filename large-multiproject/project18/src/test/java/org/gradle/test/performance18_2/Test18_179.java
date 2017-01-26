package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_179 {
    private final Production18_179 production = new Production18_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
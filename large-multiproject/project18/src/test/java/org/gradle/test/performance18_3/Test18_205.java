package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_205 {
    private final Production18_205 production = new Production18_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
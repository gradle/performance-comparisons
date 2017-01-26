package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_301 {
    private final Production18_301 production = new Production18_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
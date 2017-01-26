package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_22 {
    private final Production18_22 production = new Production18_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
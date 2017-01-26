package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_50 {
    private final Production18_50 production = new Production18_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
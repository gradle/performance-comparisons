package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_448 {
    private final Production18_448 production = new Production18_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
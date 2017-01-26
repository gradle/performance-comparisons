package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_493 {
    private final Production18_493 production = new Production18_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
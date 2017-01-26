package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_409 {
    private final Production18_409 production = new Production18_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
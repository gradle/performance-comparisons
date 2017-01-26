package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_428 {
    private final Production18_428 production = new Production18_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
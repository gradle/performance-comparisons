package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_483 {
    private final Production18_483 production = new Production18_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
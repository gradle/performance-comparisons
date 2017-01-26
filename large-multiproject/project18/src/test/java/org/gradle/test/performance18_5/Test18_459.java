package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_459 {
    private final Production18_459 production = new Production18_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
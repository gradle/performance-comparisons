package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_201 {
    private final Production18_201 production = new Production18_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_56 {
    private final Production18_56 production = new Production18_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_412 {
    private final Production18_412 production = new Production18_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
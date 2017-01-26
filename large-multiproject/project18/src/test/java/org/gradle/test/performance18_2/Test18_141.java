package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_141 {
    private final Production18_141 production = new Production18_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
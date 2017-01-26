package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_240 {
    private final Production18_240 production = new Production18_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
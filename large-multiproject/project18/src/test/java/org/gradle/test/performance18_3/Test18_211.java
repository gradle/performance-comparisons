package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_211 {
    private final Production18_211 production = new Production18_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
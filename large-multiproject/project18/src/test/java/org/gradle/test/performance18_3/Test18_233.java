package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_233 {
    private final Production18_233 production = new Production18_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
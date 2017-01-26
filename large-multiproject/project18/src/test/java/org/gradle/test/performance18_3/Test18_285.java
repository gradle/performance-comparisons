package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_285 {
    private final Production18_285 production = new Production18_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_115 {
    private final Production18_115 production = new Production18_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
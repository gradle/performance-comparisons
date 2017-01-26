package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_206 {
    private final Production18_206 production = new Production18_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
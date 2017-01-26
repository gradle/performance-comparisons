package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_223 {
    private final Production18_223 production = new Production18_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
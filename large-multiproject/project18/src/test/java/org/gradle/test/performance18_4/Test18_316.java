package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_316 {
    private final Production18_316 production = new Production18_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
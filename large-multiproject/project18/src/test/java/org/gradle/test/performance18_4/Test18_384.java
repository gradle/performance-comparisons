package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_384 {
    private final Production18_384 production = new Production18_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
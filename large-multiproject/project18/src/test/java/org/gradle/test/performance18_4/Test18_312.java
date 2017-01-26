package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_312 {
    private final Production18_312 production = new Production18_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
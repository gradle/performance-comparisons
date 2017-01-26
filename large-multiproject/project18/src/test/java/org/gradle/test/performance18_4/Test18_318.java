package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_318 {
    private final Production18_318 production = new Production18_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
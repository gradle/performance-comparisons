package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_105 {
    private final Production18_105 production = new Production18_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
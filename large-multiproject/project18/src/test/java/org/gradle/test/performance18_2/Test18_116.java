package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_116 {
    private final Production18_116 production = new Production18_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
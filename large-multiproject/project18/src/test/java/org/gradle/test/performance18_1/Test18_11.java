package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_11 {
    private final Production18_11 production = new Production18_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
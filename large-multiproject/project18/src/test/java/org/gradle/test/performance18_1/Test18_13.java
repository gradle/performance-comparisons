package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_13 {
    private final Production18_13 production = new Production18_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
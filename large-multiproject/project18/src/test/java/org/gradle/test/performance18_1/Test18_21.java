package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_21 {
    private final Production18_21 production = new Production18_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
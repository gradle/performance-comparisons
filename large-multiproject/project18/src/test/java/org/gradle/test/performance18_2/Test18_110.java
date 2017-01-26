package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_110 {
    private final Production18_110 production = new Production18_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_118 {
    private final Production18_118 production = new Production18_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
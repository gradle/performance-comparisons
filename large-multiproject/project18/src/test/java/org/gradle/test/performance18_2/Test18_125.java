package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_125 {
    private final Production18_125 production = new Production18_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
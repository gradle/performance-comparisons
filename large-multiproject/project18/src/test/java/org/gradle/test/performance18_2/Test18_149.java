package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_149 {
    private final Production18_149 production = new Production18_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
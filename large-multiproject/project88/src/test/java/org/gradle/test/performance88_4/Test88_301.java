package org.gradle.test.performance88_4;

import static org.junit.Assert.*;

public class Test88_301 {
    private final Production88_301 production = new Production88_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
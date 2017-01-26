package org.gradle.test.performance88_3;

import static org.junit.Assert.*;

public class Test88_205 {
    private final Production88_205 production = new Production88_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
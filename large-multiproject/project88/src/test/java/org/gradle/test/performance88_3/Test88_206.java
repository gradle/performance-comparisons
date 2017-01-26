package org.gradle.test.performance88_3;

import static org.junit.Assert.*;

public class Test88_206 {
    private final Production88_206 production = new Production88_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
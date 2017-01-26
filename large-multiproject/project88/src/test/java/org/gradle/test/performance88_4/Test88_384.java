package org.gradle.test.performance88_4;

import static org.junit.Assert.*;

public class Test88_384 {
    private final Production88_384 production = new Production88_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
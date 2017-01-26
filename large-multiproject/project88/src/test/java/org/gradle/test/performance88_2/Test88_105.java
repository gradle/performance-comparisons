package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_105 {
    private final Production88_105 production = new Production88_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
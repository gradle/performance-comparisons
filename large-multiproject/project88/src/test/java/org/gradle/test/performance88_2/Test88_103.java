package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_103 {
    private final Production88_103 production = new Production88_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
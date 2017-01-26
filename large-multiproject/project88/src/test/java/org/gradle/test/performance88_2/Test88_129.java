package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_129 {
    private final Production88_129 production = new Production88_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
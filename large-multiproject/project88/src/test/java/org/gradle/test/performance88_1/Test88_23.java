package org.gradle.test.performance88_1;

import static org.junit.Assert.*;

public class Test88_23 {
    private final Production88_23 production = new Production88_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
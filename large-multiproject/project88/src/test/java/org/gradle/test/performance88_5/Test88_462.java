package org.gradle.test.performance88_5;

import static org.junit.Assert.*;

public class Test88_462 {
    private final Production88_462 production = new Production88_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
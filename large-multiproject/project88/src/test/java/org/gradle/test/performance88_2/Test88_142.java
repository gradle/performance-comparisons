package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_142 {
    private final Production88_142 production = new Production88_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
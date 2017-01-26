package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_180 {
    private final Production88_180 production = new Production88_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
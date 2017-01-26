package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_150 {
    private final Production88_150 production = new Production88_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
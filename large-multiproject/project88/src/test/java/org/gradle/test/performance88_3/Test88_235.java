package org.gradle.test.performance88_3;

import static org.junit.Assert.*;

public class Test88_235 {
    private final Production88_235 production = new Production88_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance88_1;

import static org.junit.Assert.*;

public class Test88_83 {
    private final Production88_83 production = new Production88_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
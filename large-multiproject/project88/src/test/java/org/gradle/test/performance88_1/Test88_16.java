package org.gradle.test.performance88_1;

import static org.junit.Assert.*;

public class Test88_16 {
    private final Production88_16 production = new Production88_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
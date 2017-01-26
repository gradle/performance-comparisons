package org.gradle.test.performance88_1;

import static org.junit.Assert.*;

public class Test88_19 {
    private final Production88_19 production = new Production88_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
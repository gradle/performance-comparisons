package org.gradle.test.performance88_1;

import static org.junit.Assert.*;

public class Test88_70 {
    private final Production88_70 production = new Production88_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
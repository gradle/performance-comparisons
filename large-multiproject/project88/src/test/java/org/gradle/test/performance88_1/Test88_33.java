package org.gradle.test.performance88_1;

import static org.junit.Assert.*;

public class Test88_33 {
    private final Production88_33 production = new Production88_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
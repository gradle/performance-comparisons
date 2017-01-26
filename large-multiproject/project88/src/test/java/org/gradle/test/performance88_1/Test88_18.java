package org.gradle.test.performance88_1;

import static org.junit.Assert.*;

public class Test88_18 {
    private final Production88_18 production = new Production88_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance88_1;

import static org.junit.Assert.*;

public class Test88_51 {
    private final Production88_51 production = new Production88_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
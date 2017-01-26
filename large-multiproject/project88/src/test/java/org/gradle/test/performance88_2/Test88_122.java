package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_122 {
    private final Production88_122 production = new Production88_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
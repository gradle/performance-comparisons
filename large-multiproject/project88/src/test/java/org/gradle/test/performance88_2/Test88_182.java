package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_182 {
    private final Production88_182 production = new Production88_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
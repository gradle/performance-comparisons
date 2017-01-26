package org.gradle.test.performance88_3;

import static org.junit.Assert.*;

public class Test88_220 {
    private final Production88_220 production = new Production88_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
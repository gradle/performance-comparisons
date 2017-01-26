package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_143 {
    private final Production88_143 production = new Production88_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
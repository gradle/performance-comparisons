package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_181 {
    private final Production88_181 production = new Production88_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
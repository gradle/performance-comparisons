package org.gradle.test.performance88_5;

import static org.junit.Assert.*;

public class Test88_421 {
    private final Production88_421 production = new Production88_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
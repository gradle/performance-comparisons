package org.gradle.test.performance88_4;

import static org.junit.Assert.*;

public class Test88_350 {
    private final Production88_350 production = new Production88_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance88_5;

import static org.junit.Assert.*;

public class Test88_401 {
    private final Production88_401 production = new Production88_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
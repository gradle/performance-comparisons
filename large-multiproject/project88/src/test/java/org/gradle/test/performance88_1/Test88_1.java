package org.gradle.test.performance88_1;

import static org.junit.Assert.*;

public class Test88_1 {
    private final Production88_1 production = new Production88_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
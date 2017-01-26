package org.gradle.test.performance88_1;

import static org.junit.Assert.*;

public class Test88_4 {
    private final Production88_4 production = new Production88_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
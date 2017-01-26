package org.gradle.test.performance88_1;

import static org.junit.Assert.*;

public class Test88_5 {
    private final Production88_5 production = new Production88_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
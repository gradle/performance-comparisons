package org.gradle.test.performance88_1;

import static org.junit.Assert.*;

public class Test88_7 {
    private final Production88_7 production = new Production88_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
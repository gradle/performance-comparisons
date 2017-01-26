package org.gradle.test.performance88_1;

import static org.junit.Assert.*;

public class Test88_2 {
    private final Production88_2 production = new Production88_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
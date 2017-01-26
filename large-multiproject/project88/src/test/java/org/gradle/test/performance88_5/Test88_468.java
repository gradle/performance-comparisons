package org.gradle.test.performance88_5;

import static org.junit.Assert.*;

public class Test88_468 {
    private final Production88_468 production = new Production88_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
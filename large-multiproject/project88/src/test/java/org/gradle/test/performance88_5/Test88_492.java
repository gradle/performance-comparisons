package org.gradle.test.performance88_5;

import static org.junit.Assert.*;

public class Test88_492 {
    private final Production88_492 production = new Production88_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
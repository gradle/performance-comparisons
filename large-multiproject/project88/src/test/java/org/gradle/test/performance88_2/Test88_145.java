package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_145 {
    private final Production88_145 production = new Production88_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
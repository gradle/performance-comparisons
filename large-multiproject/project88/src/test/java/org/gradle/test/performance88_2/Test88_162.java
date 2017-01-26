package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_162 {
    private final Production88_162 production = new Production88_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
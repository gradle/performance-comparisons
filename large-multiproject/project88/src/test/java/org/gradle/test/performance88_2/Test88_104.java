package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_104 {
    private final Production88_104 production = new Production88_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
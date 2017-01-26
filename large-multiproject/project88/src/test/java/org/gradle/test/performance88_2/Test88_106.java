package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_106 {
    private final Production88_106 production = new Production88_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
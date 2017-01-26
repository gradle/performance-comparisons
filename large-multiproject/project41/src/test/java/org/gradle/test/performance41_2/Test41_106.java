package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_106 {
    private final Production41_106 production = new Production41_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
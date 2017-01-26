package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_116 {
    private final Production25_116 production = new Production25_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
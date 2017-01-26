package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_149 {
    private final Production25_149 production = new Production25_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
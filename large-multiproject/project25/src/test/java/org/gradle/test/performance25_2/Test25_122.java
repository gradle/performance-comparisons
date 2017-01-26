package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_122 {
    private final Production25_122 production = new Production25_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
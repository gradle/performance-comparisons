package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_56 {
    private final Production25_56 production = new Production25_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
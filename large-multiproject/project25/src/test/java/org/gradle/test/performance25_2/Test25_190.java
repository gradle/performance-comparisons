package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_190 {
    private final Production25_190 production = new Production25_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
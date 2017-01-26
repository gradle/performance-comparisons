package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_242 {
    private final Production25_242 production = new Production25_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
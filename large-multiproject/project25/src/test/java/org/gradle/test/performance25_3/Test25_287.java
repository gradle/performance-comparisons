package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_287 {
    private final Production25_287 production = new Production25_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
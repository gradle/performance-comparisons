package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_484 {
    private final Production25_484 production = new Production25_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
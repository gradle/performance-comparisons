package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_165 {
    private final Production25_165 production = new Production25_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
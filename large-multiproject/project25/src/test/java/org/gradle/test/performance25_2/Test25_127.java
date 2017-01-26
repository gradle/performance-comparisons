package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_127 {
    private final Production25_127 production = new Production25_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
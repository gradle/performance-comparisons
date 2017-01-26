package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_113 {
    private final Production25_113 production = new Production25_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
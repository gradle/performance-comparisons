package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_30 {
    private final Production25_30 production = new Production25_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
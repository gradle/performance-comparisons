package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_70 {
    private final Production25_70 production = new Production25_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
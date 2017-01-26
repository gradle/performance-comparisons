package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_21 {
    private final Production25_21 production = new Production25_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
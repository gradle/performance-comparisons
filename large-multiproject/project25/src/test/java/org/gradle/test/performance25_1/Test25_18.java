package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_18 {
    private final Production25_18 production = new Production25_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
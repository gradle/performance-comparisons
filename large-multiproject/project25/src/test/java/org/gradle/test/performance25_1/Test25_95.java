package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_95 {
    private final Production25_95 production = new Production25_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
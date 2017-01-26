package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_12 {
    private final Production25_12 production = new Production25_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
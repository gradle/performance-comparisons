package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_19 {
    private final Production25_19 production = new Production25_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
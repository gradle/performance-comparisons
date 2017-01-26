package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_387 {
    private final Production25_387 production = new Production25_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
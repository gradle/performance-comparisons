package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_261 {
    private final Production47_261 production = new Production47_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
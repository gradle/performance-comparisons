package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_299 {
    private final Production30_299 production = new Production30_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
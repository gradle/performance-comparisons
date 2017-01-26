package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_22 {
    private final Production30_22 production = new Production30_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_448 {
    private final Production30_448 production = new Production30_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_359 {
    private final Production30_359 production = new Production30_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
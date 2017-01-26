package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_344 {
    private final Production30_344 production = new Production30_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
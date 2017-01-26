package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_332 {
    private final Production30_332 production = new Production30_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
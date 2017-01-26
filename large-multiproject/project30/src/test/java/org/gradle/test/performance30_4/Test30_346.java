package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_346 {
    private final Production30_346 production = new Production30_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
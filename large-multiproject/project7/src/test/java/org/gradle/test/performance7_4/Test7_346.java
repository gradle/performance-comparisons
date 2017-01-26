package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_346 {
    private final Production7_346 production = new Production7_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
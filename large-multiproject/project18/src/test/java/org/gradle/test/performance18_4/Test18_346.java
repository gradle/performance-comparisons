package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_346 {
    private final Production18_346 production = new Production18_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
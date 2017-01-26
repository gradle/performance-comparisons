package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_346 {
    private final Production3_346 production = new Production3_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
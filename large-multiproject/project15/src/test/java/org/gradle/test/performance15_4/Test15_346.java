package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_346 {
    private final Production15_346 production = new Production15_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
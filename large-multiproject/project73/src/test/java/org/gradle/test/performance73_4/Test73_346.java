package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_346 {
    private final Production73_346 production = new Production73_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
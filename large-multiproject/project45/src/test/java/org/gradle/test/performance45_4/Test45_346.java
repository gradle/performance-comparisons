package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_346 {
    private final Production45_346 production = new Production45_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_346 {
    private final Production97_346 production = new Production97_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
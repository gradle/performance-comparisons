package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_346 {
    private final Production63_346 production = new Production63_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
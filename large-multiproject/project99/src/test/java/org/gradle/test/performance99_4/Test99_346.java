package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_346 {
    private final Production99_346 production = new Production99_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
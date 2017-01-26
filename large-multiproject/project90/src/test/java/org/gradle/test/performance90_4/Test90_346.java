package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_346 {
    private final Production90_346 production = new Production90_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
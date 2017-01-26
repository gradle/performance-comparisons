package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_397 {
    private final Production90_397 production = new Production90_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
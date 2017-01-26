package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_313 {
    private final Production80_313 production = new Production80_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_487 {
    private final Production26_487 production = new Production26_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
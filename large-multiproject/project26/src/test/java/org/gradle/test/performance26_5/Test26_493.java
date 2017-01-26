package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_493 {
    private final Production26_493 production = new Production26_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
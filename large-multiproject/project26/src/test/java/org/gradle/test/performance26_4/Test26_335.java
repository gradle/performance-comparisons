package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_335 {
    private final Production26_335 production = new Production26_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
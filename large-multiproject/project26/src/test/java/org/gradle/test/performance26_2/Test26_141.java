package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_141 {
    private final Production26_141 production = new Production26_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
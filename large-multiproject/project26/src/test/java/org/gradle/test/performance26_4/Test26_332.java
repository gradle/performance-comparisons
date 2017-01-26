package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_332 {
    private final Production26_332 production = new Production26_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_344 {
    private final Production26_344 production = new Production26_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
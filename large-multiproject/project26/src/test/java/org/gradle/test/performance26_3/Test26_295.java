package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_295 {
    private final Production26_295 production = new Production26_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
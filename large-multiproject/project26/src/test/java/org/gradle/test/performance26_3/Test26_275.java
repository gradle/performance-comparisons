package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_275 {
    private final Production26_275 production = new Production26_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
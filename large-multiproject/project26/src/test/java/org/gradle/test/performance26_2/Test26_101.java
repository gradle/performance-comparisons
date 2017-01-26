package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_101 {
    private final Production26_101 production = new Production26_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
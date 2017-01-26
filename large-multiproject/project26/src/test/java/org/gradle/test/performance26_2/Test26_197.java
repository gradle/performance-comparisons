package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_197 {
    private final Production26_197 production = new Production26_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_185 {
    private final Production26_185 production = new Production26_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
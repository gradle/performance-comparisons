package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_121 {
    private final Production26_121 production = new Production26_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
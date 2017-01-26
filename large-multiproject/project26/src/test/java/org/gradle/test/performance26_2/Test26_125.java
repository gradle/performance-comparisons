package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_125 {
    private final Production26_125 production = new Production26_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
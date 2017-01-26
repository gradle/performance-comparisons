package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_298 {
    private final Production26_298 production = new Production26_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
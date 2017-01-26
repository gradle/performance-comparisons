package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_279 {
    private final Production26_279 production = new Production26_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
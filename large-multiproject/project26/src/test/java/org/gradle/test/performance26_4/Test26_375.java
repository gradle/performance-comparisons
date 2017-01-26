package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_375 {
    private final Production26_375 production = new Production26_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
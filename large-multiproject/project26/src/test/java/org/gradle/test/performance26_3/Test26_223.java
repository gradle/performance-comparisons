package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_223 {
    private final Production26_223 production = new Production26_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_316 {
    private final Production26_316 production = new Production26_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
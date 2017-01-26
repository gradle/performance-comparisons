package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_250 {
    private final Production26_250 production = new Production26_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
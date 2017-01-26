package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_256 {
    private final Production26_256 production = new Production26_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
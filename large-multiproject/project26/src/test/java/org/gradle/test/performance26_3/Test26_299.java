package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_299 {
    private final Production26_299 production = new Production26_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
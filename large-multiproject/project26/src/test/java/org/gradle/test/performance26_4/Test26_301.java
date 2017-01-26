package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_301 {
    private final Production26_301 production = new Production26_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
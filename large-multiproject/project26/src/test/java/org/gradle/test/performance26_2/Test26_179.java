package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_179 {
    private final Production26_179 production = new Production26_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
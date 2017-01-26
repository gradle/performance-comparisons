package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_410 {
    private final Production26_410 production = new Production26_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
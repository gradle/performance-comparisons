package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_311 {
    private final Production26_311 production = new Production26_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
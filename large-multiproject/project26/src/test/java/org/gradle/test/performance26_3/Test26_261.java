package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_261 {
    private final Production26_261 production = new Production26_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
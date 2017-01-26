package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_261 {
    private final Production93_261 production = new Production93_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
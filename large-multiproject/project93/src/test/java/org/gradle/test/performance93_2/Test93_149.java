package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_149 {
    private final Production93_149 production = new Production93_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
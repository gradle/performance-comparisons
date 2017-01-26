package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_118 {
    private final Production93_118 production = new Production93_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
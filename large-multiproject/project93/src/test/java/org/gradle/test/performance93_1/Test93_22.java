package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_22 {
    private final Production93_22 production = new Production93_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
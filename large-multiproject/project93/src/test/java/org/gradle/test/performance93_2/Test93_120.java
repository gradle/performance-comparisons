package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_120 {
    private final Production93_120 production = new Production93_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
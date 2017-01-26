package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_79 {
    private final Production93_79 production = new Production93_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
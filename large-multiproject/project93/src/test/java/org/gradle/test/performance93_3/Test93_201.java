package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_201 {
    private final Production93_201 production = new Production93_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_274 {
    private final Production93_274 production = new Production93_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
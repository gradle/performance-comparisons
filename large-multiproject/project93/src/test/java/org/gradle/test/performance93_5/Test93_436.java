package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_436 {
    private final Production93_436 production = new Production93_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_426 {
    private final Production93_426 production = new Production93_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
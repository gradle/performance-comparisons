package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_426 {
    private final Production58_426 production = new Production58_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
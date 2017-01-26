package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_426 {
    private final Production4_426 production = new Production4_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
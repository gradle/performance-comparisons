package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_426 {
    private final Production89_426 production = new Production89_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
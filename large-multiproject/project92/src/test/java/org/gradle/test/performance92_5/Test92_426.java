package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_426 {
    private final Production92_426 production = new Production92_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_426 {
    private final Production55_426 production = new Production55_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
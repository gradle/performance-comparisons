package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_426 {
    private final Production63_426 production = new Production63_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
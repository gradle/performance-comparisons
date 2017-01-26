package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_426 {
    private final Production14_426 production = new Production14_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
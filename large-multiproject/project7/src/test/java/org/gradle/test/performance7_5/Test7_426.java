package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_426 {
    private final Production7_426 production = new Production7_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
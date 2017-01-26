package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_426 {
    private final Production86_426 production = new Production86_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
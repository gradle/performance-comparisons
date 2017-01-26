package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_426 {
    private final Production37_426 production = new Production37_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
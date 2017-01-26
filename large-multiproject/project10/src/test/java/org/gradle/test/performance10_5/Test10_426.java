package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_426 {
    private final Production10_426 production = new Production10_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
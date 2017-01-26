package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_426 {
    private final Production77_426 production = new Production77_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
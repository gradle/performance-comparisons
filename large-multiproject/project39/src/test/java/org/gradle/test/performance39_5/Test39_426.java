package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_426 {
    private final Production39_426 production = new Production39_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
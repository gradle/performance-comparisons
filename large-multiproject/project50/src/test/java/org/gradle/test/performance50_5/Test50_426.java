package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_426 {
    private final Production50_426 production = new Production50_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_426 {
    private final Production15_426 production = new Production15_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
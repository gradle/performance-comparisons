package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_426 {
    private final Production26_426 production = new Production26_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_426 {
    private final Production99_426 production = new Production99_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
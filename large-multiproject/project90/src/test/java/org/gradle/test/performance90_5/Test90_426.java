package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_426 {
    private final Production90_426 production = new Production90_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
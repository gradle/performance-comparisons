package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_426 {
    private final Production62_426 production = new Production62_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
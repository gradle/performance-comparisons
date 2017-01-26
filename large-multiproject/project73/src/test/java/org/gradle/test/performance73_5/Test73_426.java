package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_426 {
    private final Production73_426 production = new Production73_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
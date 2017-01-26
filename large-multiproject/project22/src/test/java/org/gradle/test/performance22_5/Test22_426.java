package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_426 {
    private final Production22_426 production = new Production22_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
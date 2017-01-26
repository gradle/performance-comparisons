package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_426 {
    private final Production72_426 production = new Production72_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
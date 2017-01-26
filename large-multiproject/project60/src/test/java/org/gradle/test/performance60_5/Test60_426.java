package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_426 {
    private final Production60_426 production = new Production60_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
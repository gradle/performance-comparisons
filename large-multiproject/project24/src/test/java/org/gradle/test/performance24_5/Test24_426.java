package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_426 {
    private final Production24_426 production = new Production24_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
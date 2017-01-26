package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_426 {
    private final Production49_426 production = new Production49_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_426 {
    private final Production1_426 production = new Production1_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
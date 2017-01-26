package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_426 {
    private final Production57_426 production = new Production57_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
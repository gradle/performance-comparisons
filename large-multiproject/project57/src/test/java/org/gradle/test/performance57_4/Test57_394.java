package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_394 {
    private final Production57_394 production = new Production57_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_252 {
    private final Production57_252 production = new Production57_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
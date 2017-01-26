package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_455 {
    private final Production57_455 production = new Production57_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
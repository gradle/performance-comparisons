package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_443 {
    private final Production57_443 production = new Production57_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
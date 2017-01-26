package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_418 {
    private final Production57_418 production = new Production57_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
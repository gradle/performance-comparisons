package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_441 {
    private final Production57_441 production = new Production57_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_95 {
    private final Production57_95 production = new Production57_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_18 {
    private final Production57_18 production = new Production57_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
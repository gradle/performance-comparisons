package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_12 {
    private final Production57_12 production = new Production57_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
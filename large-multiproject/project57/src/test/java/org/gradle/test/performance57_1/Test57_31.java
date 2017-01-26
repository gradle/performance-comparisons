package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_31 {
    private final Production57_31 production = new Production57_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
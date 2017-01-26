package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_463 {
    private final Production57_463 production = new Production57_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
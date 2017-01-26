package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_99 {
    private final Production57_99 production = new Production57_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
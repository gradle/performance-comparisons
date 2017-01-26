package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_46 {
    private final Production57_46 production = new Production57_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
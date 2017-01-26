package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_61 {
    private final Production57_61 production = new Production57_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
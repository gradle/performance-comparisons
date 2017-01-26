package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_67 {
    private final Production57_67 production = new Production57_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_488 {
    private final Production57_488 production = new Production57_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
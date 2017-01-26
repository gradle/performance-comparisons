package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_9 {
    private final Production57_9 production = new Production57_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
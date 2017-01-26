package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_396 {
    private final Production57_396 production = new Production57_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
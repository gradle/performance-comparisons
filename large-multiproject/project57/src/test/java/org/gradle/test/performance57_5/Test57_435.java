package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_435 {
    private final Production57_435 production = new Production57_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
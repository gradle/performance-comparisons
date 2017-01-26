package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_381 {
    private final Production57_381 production = new Production57_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
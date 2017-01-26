package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_412 {
    private final Production57_412 production = new Production57_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
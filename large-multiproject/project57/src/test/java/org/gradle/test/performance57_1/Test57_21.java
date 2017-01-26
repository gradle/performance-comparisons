package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_21 {
    private final Production57_21 production = new Production57_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
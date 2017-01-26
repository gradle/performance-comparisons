package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_462 {
    private final Production57_462 production = new Production57_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
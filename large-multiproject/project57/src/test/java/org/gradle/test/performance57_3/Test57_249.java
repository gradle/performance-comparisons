package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_249 {
    private final Production57_249 production = new Production57_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
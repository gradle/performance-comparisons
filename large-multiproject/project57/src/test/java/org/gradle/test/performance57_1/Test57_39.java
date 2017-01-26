package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_39 {
    private final Production57_39 production = new Production57_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_81 {
    private final Production57_81 production = new Production57_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
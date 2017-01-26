package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_198 {
    private final Production57_198 production = new Production57_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
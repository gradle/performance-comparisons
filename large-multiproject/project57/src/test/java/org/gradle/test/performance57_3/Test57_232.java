package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_232 {
    private final Production57_232 production = new Production57_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
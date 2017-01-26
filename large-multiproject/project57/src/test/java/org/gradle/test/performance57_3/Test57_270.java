package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_270 {
    private final Production57_270 production = new Production57_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
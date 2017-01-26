package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_237 {
    private final Production57_237 production = new Production57_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
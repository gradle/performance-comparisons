package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_57 {
    private final Production57_57 production = new Production57_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
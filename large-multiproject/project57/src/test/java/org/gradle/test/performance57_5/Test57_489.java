package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_489 {
    private final Production57_489 production = new Production57_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
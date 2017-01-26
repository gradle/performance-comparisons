package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_343 {
    private final Production57_343 production = new Production57_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
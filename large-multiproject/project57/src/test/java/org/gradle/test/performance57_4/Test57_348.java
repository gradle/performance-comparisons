package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_348 {
    private final Production57_348 production = new Production57_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
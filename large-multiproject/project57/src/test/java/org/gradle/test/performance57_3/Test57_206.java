package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_206 {
    private final Production57_206 production = new Production57_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
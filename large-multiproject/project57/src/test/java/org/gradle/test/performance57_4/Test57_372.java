package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_372 {
    private final Production57_372 production = new Production57_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
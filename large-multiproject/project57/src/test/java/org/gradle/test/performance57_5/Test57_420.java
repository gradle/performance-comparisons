package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_420 {
    private final Production57_420 production = new Production57_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
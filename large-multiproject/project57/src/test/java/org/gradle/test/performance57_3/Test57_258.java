package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_258 {
    private final Production57_258 production = new Production57_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_52 {
    private final Production57_52 production = new Production57_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
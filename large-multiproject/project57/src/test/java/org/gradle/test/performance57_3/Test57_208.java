package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_208 {
    private final Production57_208 production = new Production57_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
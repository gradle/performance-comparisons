package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_205 {
    private final Production57_205 production = new Production57_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
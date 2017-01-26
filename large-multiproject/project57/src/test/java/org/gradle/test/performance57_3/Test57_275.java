package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_275 {
    private final Production57_275 production = new Production57_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
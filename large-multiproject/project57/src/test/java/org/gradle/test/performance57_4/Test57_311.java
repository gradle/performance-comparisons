package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_311 {
    private final Production57_311 production = new Production57_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
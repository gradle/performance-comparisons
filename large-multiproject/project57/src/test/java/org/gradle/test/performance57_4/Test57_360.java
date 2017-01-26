package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_360 {
    private final Production57_360 production = new Production57_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
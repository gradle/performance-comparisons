package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_170 {
    private final Production57_170 production = new Production57_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
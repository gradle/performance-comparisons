package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_155 {
    private final Production57_155 production = new Production57_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
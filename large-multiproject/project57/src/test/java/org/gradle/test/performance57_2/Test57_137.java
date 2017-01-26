package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_137 {
    private final Production57_137 production = new Production57_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
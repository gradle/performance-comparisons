package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_313 {
    private final Production57_313 production = new Production57_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
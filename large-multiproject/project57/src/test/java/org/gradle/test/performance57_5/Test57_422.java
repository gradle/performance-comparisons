package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_422 {
    private final Production57_422 production = new Production57_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
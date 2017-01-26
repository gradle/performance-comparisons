package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_261 {
    private final Production57_261 production = new Production57_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
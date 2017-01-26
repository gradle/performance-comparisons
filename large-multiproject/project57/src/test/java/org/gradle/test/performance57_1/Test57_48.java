package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_48 {
    private final Production57_48 production = new Production57_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
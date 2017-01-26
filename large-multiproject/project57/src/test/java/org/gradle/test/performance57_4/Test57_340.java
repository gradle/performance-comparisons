package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_340 {
    private final Production57_340 production = new Production57_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
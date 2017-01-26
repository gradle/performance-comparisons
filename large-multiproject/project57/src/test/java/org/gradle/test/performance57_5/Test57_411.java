package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_411 {
    private final Production57_411 production = new Production57_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
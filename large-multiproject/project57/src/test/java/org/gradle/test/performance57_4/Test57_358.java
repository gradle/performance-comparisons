package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_358 {
    private final Production57_358 production = new Production57_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
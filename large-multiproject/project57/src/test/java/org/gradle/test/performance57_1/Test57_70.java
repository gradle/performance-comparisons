package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_70 {
    private final Production57_70 production = new Production57_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
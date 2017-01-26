package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_30 {
    private final Production57_30 production = new Production57_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
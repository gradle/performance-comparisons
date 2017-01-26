package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_165 {
    private final Production57_165 production = new Production57_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_143 {
    private final Production57_143 production = new Production57_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
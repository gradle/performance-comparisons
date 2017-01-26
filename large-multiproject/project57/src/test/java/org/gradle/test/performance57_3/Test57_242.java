package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_242 {
    private final Production57_242 production = new Production57_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
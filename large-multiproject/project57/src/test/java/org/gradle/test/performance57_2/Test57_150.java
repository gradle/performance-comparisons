package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_150 {
    private final Production57_150 production = new Production57_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
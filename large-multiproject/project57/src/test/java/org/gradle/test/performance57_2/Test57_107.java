package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_107 {
    private final Production57_107 production = new Production57_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
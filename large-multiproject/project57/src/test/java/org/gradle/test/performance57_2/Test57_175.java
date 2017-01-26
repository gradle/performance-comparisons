package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_175 {
    private final Production57_175 production = new Production57_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_139 {
    private final Production57_139 production = new Production57_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
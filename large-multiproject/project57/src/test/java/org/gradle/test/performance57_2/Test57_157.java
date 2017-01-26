package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_157 {
    private final Production57_157 production = new Production57_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
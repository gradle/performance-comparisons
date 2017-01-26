package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_1 {
    private final Production57_1 production = new Production57_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
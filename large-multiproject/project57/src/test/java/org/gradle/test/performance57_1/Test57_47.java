package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_47 {
    private final Production57_47 production = new Production57_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
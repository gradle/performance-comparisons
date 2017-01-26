package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_8 {
    private final Production57_8 production = new Production57_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_16 {
    private final Production57_16 production = new Production57_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
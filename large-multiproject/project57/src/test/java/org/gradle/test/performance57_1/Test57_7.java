package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_7 {
    private final Production57_7 production = new Production57_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
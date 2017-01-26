package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_6 {
    private final Production57_6 production = new Production57_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
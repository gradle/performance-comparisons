package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_5 {
    private final Production57_5 production = new Production57_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
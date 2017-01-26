package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_35 {
    private final Production57_35 production = new Production57_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
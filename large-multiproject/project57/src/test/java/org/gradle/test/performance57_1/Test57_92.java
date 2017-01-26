package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_92 {
    private final Production57_92 production = new Production57_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
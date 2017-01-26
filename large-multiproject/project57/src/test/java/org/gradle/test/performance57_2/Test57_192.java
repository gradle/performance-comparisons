package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_192 {
    private final Production57_192 production = new Production57_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
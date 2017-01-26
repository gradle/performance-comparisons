package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_224 {
    private final Production57_224 production = new Production57_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_499 {
    private final Production57_499 production = new Production57_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
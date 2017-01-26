package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_82 {
    private final Production57_82 production = new Production57_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
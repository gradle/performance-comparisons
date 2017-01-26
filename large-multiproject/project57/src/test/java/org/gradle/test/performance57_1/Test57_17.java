package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_17 {
    private final Production57_17 production = new Production57_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_480 {
    private final Production57_480 production = new Production57_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
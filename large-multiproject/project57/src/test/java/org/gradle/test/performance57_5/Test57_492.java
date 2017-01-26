package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_492 {
    private final Production57_492 production = new Production57_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
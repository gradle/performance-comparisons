package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_415 {
    private final Production57_415 production = new Production57_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
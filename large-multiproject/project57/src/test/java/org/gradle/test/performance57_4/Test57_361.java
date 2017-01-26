package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_361 {
    private final Production57_361 production = new Production57_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
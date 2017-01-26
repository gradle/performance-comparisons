package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_324 {
    private final Production57_324 production = new Production57_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
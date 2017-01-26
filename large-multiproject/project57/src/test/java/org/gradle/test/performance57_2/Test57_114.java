package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_114 {
    private final Production57_114 production = new Production57_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
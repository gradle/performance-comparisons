package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_142 {
    private final Production57_142 production = new Production57_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
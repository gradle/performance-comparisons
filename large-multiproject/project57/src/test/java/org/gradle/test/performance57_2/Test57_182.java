package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_182 {
    private final Production57_182 production = new Production57_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
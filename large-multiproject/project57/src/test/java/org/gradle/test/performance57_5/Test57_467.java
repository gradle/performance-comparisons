package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_467 {
    private final Production57_467 production = new Production57_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
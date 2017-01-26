package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_399 {
    private final Production57_399 production = new Production57_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
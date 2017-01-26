package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_308 {
    private final Production57_308 production = new Production57_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
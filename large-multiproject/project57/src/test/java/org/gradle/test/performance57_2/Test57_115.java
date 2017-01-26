package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_115 {
    private final Production57_115 production = new Production57_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
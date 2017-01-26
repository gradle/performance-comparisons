package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_233 {
    private final Production57_233 production = new Production57_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
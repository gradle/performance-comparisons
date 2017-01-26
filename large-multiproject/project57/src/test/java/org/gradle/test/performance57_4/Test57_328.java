package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_328 {
    private final Production57_328 production = new Production57_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
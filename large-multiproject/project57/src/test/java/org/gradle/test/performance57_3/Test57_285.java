package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_285 {
    private final Production57_285 production = new Production57_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
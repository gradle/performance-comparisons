package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_33 {
    private final Production57_33 production = new Production57_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
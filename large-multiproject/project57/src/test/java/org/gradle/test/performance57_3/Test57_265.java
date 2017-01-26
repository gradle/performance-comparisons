package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_265 {
    private final Production57_265 production = new Production57_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
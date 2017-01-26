package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_221 {
    private final Production57_221 production = new Production57_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
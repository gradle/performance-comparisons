package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_131 {
    private final Production57_131 production = new Production57_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
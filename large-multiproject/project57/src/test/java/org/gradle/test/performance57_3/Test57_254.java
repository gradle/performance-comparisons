package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_254 {
    private final Production57_254 production = new Production57_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
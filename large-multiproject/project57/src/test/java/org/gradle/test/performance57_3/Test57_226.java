package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_226 {
    private final Production57_226 production = new Production57_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
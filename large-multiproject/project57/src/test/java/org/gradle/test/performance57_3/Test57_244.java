package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_244 {
    private final Production57_244 production = new Production57_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
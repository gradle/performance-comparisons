package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_217 {
    private final Production57_217 production = new Production57_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
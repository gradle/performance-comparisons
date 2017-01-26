package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_398 {
    private final Production57_398 production = new Production57_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_377 {
    private final Production57_377 production = new Production57_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
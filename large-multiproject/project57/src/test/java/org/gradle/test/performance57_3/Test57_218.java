package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_218 {
    private final Production57_218 production = new Production57_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
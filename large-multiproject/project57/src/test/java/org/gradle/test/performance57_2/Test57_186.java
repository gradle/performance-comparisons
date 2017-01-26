package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_186 {
    private final Production57_186 production = new Production57_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
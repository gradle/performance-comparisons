package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_204 {
    private final Production57_204 production = new Production57_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
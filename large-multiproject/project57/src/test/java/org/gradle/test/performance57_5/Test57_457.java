package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_457 {
    private final Production57_457 production = new Production57_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
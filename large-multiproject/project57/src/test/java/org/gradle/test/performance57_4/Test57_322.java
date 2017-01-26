package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_322 {
    private final Production57_322 production = new Production57_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
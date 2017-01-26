package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_215 {
    private final Production57_215 production = new Production57_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
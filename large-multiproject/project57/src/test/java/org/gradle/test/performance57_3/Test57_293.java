package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_293 {
    private final Production57_293 production = new Production57_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
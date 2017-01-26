package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_191 {
    private final Production57_191 production = new Production57_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
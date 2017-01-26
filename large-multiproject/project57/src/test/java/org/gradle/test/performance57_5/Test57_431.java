package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_431 {
    private final Production57_431 production = new Production57_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
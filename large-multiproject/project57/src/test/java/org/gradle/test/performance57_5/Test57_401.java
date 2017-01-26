package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_401 {
    private final Production57_401 production = new Production57_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
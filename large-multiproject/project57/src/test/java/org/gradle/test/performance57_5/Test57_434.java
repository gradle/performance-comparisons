package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_434 {
    private final Production57_434 production = new Production57_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
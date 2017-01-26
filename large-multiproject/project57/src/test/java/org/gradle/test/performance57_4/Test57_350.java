package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_350 {
    private final Production57_350 production = new Production57_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
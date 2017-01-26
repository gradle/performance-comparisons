package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_474 {
    private final Production57_474 production = new Production57_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
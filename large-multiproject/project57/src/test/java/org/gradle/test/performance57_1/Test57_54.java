package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_54 {
    private final Production57_54 production = new Production57_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
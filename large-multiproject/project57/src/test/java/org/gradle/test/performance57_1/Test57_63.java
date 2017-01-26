package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_63 {
    private final Production57_63 production = new Production57_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_42 {
    private final Production57_42 production = new Production57_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
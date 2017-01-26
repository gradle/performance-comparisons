package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_34 {
    private final Production57_34 production = new Production57_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
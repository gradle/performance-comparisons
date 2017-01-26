package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_26 {
    private final Production57_26 production = new Production57_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
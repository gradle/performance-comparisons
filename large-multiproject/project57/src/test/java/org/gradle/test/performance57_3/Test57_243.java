package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_243 {
    private final Production57_243 production = new Production57_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
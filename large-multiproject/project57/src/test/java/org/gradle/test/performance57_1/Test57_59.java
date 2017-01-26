package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_59 {
    private final Production57_59 production = new Production57_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
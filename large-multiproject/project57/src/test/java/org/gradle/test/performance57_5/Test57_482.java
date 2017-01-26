package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_482 {
    private final Production57_482 production = new Production57_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
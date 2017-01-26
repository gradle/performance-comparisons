package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_395 {
    private final Production57_395 production = new Production57_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
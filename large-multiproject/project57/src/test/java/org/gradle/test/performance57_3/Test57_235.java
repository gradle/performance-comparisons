package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_235 {
    private final Production57_235 production = new Production57_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
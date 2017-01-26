package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_187 {
    private final Production57_187 production = new Production57_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
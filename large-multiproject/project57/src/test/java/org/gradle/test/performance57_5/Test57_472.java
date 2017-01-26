package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_472 {
    private final Production57_472 production = new Production57_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
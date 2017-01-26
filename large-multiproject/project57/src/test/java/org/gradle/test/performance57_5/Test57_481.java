package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_481 {
    private final Production57_481 production = new Production57_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
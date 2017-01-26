package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_423 {
    private final Production57_423 production = new Production57_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_329 {
    private final Production57_329 production = new Production57_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
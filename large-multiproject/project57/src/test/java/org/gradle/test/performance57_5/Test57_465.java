package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_465 {
    private final Production57_465 production = new Production57_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
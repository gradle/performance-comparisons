package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_419 {
    private final Production57_419 production = new Production57_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
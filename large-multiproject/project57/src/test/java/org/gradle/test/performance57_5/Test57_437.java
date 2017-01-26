package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_437 {
    private final Production57_437 production = new Production57_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
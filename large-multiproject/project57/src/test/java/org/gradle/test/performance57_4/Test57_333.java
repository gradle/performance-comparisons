package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_333 {
    private final Production57_333 production = new Production57_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
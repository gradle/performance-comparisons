package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_367 {
    private final Production57_367 production = new Production57_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
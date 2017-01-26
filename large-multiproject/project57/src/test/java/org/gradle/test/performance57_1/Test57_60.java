package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_60 {
    private final Production57_60 production = new Production57_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
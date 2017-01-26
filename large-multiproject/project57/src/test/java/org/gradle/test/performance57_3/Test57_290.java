package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_290 {
    private final Production57_290 production = new Production57_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
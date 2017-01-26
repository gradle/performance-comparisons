package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_364 {
    private final Production57_364 production = new Production57_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_151 {
    private final Production57_151 production = new Production57_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
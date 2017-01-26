package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_147 {
    private final Production57_147 production = new Production57_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
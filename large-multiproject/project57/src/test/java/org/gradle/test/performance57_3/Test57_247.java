package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_247 {
    private final Production57_247 production = new Production57_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
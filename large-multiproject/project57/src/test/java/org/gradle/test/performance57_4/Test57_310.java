package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_310 {
    private final Production57_310 production = new Production57_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
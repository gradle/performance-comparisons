package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_424 {
    private final Production57_424 production = new Production57_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
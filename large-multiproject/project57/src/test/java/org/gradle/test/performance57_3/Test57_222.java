package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_222 {
    private final Production57_222 production = new Production57_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
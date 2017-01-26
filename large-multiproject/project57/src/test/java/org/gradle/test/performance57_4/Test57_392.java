package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_392 {
    private final Production57_392 production = new Production57_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
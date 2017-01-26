package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_14 {
    private final Production57_14 production = new Production57_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
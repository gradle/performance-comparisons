package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_10 {
    private final Production57_10 production = new Production57_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
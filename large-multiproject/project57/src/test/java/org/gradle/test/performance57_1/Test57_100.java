package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_100 {
    private final Production57_100 production = new Production57_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
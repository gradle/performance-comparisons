package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_289 {
    private final Production57_289 production = new Production57_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_388 {
    private final Production57_388 production = new Production57_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
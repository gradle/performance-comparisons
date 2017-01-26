package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_330 {
    private final Production57_330 production = new Production57_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
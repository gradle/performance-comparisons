package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_286 {
    private final Production57_286 production = new Production57_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
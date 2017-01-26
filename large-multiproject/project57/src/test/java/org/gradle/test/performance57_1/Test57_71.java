package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_71 {
    private final Production57_71 production = new Production57_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
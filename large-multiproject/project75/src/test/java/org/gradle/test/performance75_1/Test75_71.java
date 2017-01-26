package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_71 {
    private final Production75_71 production = new Production75_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_62 {
    private final Production75_62 production = new Production75_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
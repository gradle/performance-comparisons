package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_10 {
    private final Production75_10 production = new Production75_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
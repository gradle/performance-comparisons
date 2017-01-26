package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_157 {
    private final Production75_157 production = new Production75_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
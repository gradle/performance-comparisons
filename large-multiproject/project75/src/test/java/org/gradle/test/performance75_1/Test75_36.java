package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_36 {
    private final Production75_36 production = new Production75_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
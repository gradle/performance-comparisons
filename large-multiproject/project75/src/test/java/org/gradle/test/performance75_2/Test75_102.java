package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_102 {
    private final Production75_102 production = new Production75_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
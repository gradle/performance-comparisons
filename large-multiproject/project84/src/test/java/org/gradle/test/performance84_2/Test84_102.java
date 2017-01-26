package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_102 {
    private final Production84_102 production = new Production84_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
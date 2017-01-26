package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_58 {
    private final Production75_58 production = new Production75_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
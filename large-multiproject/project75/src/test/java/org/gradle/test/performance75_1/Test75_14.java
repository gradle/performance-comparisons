package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_14 {
    private final Production75_14 production = new Production75_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
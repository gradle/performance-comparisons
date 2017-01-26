package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_238 {
    private final Production75_238 production = new Production75_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
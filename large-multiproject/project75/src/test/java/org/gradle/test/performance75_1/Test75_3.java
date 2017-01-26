package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_3 {
    private final Production75_3 production = new Production75_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
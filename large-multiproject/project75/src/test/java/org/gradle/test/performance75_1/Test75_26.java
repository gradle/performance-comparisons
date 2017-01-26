package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_26 {
    private final Production75_26 production = new Production75_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
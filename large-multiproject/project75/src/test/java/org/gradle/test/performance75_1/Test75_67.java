package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_67 {
    private final Production75_67 production = new Production75_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_78 {
    private final Production75_78 production = new Production75_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
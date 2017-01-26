package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_72 {
    private final Production75_72 production = new Production75_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
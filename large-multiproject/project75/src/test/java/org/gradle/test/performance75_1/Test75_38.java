package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_38 {
    private final Production75_38 production = new Production75_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
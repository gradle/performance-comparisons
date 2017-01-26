package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_75 {
    private final Production75_75 production = new Production75_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
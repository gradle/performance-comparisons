package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_442 {
    private final Production75_442 production = new Production75_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
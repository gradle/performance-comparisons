package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_214 {
    private final Production75_214 production = new Production75_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}